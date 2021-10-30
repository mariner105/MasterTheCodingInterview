package trees;

import common.BinaryTreeNode;

public class BinarySearchTree {

    private BinaryTreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(BinaryTreeNode root) {
        this.root = root;
    }

    public BinarySearchTree insert(int value) {
        //First node
        if (root == null) {
            root = newChildNode(value);
            return this;
        }

        insertNode(value, root);
        return this;
    }

    private void insertNode(int value, BinaryTreeNode node) {
        if (value < node.getValue()) {
            //Look left
            BinaryTreeNode left = node.getLeft();
            if (left == null) {
                node.setLeft(newChildNode(value));
                return;
            }
            insertNode(value, left);
        } else {
            //Look right
            BinaryTreeNode right = node.getRight();
            if (right == null) {
                node.setRight(newChildNode(value));
                return;
            }
            insertNode(value, right);
        }
    }

    private BinaryTreeNode newChildNode(int value) {
        return new BinaryTreeNode(value, null, null);
    }

    public BinaryTreeNode lookup(int value) {
        return search(value, root);
    }

    private BinaryTreeNode search(int value, BinaryTreeNode node) {
        if (node == null) {
            return null;
        }

        if (value == node.getValue()) {
            return node;
        } else if (value < root.getValue()) {
            return search(value, node.getLeft());
        } else {
            return search(value, node.getRight());
        }
    }

    public BinaryTreeNode remove(int value) {
        throw new RuntimeException("Not yet coded"); //TODO

        //return null;//TODO
    }

    public String traverse(BinaryTreeNode node) {
        StringBuilder tree = new StringBuilder(200);
        if (root != null) {
            tree.append(root.getValue()).append(" ");
        }
        buildTree(tree, node);

        return tree.toString();
    }

    private void buildTree(StringBuilder tree, BinaryTreeNode node) {
        //Check for base case
        if (node.getLeft() == null && node.getRight() == null) {
            return;
        }

        if (node.getLeft() != null) {
            BinaryTreeNode left = node.getLeft();
            tree.append(left.getValue()).append(" ");
            buildTree(tree, left);
        }

        if (node.getRight() != null) {
            BinaryTreeNode right = node.getRight();
            tree.append(right.getValue()).append(" ");
            buildTree(tree, right);
        }
    }

    public BinaryTreeNode getRoot() {
        return root;
    }
}
