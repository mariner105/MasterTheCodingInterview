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
        //First node added to the tree
        if (root == null) {
            root = newChildNode(value);
            return this;
        }

        insertNode(value, root);
        return this;
    }

    private void insertNode(int value, BinaryTreeNode currentNode) {
        if (value < currentNode.getValue()) {
            //Insert left
            BinaryTreeNode left = currentNode.getLeft();
            if (left == null) {
                currentNode.setLeft(newChildNode(value));
                return;
            }
            insertNode(value, left);
        } else {
            //Insert right
            BinaryTreeNode right = currentNode.getRight();
            if (right == null) {
                currentNode.setRight(newChildNode(value));
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

    private BinaryTreeNode search(int value, BinaryTreeNode currentNode) {
        if (currentNode == null) {
            return null;
        }

        if (value == currentNode.getValue()) {
            return currentNode;
        } else if (value < root.getValue()) {
            return search(value, currentNode.getLeft());
        } else {
            return search(value, currentNode.getRight());
        }
    }

    public BinaryTreeNode remove(int value) {
        throw new RuntimeException("Not yet coded"); //TODO

        //return null;//TODO
    }

    public String nodeToJson(BinaryTreeNode currentNode) {
        if (currentNode == null) {
            return "{null}";
        }

        //Start a Json object
        StringBuilder stringBuilder = new StringBuilder(200);
        stringBuilder.append("{");

        BinaryTreeNode left = currentNode.getLeft();
        BinaryTreeNode right  = currentNode.getRight();

        //Record value
        stringBuilder
                .append("\"value\":")
                .append(currentNode.getValue())
                .append(",");

        //Go left node
        stringBuilder
                .append("\"left\":")
                .append(left == null ? "null" : nodeToJson(left))
                .append(",");


        //Go right node
        stringBuilder
                .append("\"right\":")
                .append(right == null ? "null" : nodeToJson(right));


        //End a Json object
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public BinaryTreeNode getRoot() {
        return root;
    }
}
