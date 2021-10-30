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
        if (root == null) {
            return null;
        }
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
        if (root == null) {
            return null;
        }

        BinaryTreeNode parentNode = null;
        BinaryTreeNode currentNode = root;
        while (currentNode != null) {
            if (value < currentNode.getValue()){
                //Go left
                parentNode = currentNode;
                currentNode = currentNode.getLeft();
            } else if (value > currentNode.getValue()) {
                //Go right
                parentNode = currentNode;
                currentNode = currentNode.getRight();
            } else if (currentNode.getValue() == value){
                //Found the node, now we have work to do

                //Option 1: no right child
                if (currentNode.getRight() == null) {
                    if (parentNode == null) {
                        root = currentNode.getLeft();
                    } else {

                        //if parent > current value, make current left child a child of parent
                        if (currentNode.getValue() < parentNode.getValue()) {
                            parentNode.setLeft(currentNode.getLeft());

                        //if parent < current value, make left child a right child of parent
                        } else if (currentNode.getValue() > parentNode.getValue()) {
                            parentNode.setRight(currentNode.getLeft());
                        }
                    }
                //Option 2: Right child which doesn't have a left child
                } else if (currentNode.getRight().getLeft() == null) {
                    if (parentNode == null) {
                        root = currentNode.getLeft();
                    } else {
                        currentNode.getRight().setLeft(currentNode.getLeft());

                        //if parent > current, make right child
                        // of the left the parent.
                        if (currentNode.getValue() < parentNode.getValue()) {
                            parentNode.setLeft(currentNode.getRight());

                        //if parent < current, make right child a
                        // right child of the parent
                        } else if (currentNode.getValue() > parentNode.getValue()) {
                            parentNode.setRight(currentNode.getRight());
                        }
                    }

                //Option 3: Right child that has a left child
                } else  {
                    //find the Right child's left most child
                    BinaryTreeNode leftmost = currentNode.getRight().getLeft();
                    BinaryTreeNode leftmostParent = currentNode.getRight();
                    while (leftmost.getLeft() != null) {
                        leftmostParent = leftmost;
                        leftmost = leftmost.getLeft();
                    }

                    //Parent's left subtree is now leftmost's
                    // right subtree
                    leftmostParent.setLeft(leftmost.getRight());
                    leftmost.setLeft(currentNode.getLeft());
                    leftmost.setRight(currentNode.getRight());

                    if (parentNode == null) {
                        root = leftmost;
                    } else {
                        if (currentNode.getValue() < parentNode.getValue()) {
                            parentNode.setLeft(leftmost);
                        } else if (currentNode.getValue() > parentNode.getValue()) {
                            parentNode.setRight(leftmost);
                        }
                    }
                }
                return currentNode;
            }
        }

        return null;
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
