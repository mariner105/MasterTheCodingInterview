package trees;

import common.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree {

    private BinaryTreeNode root;

    public BinarySearchTree() {
        this.root = null;
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

    public List<Integer> breadthFirstSearch() {
        BinaryTreeNode currentNode = root;
        List<Integer> list = new ArrayList<>(50); //This will be our return value
        LinkedList<BinaryTreeNode> queue = new LinkedList<>(); //Used to hold the nodes that we want to search
        queue.add(currentNode); //Note: use add and pop for queue functionality

        while (queue.size() > 0) {
            currentNode = queue.pop();
            System.out.println(currentNode.getValue());
            //Add current node to the list
            list.add(currentNode.getValue());

            //Add children of currentNode to the queue
            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }

        return list;
    }

    /**
     * A recursive version of BFS.
     * Note: that BFS is normally not implemented using recursion.
     * @return list of values
     */
    public List<Integer> breadthFirstSearchR() {
        List<Integer> list = new ArrayList<>(50); //This will be our return value
        LinkedList<BinaryTreeNode> queue = new LinkedList<>(); //Used to hold the nodes that we want to search
        queue.add(root); //Note: use add and pop for queue functionality
        return breadthFirstSearchRecursion(queue, list);
    }

    private List<Integer> breadthFirstSearchRecursion(LinkedList<BinaryTreeNode> queue, List<Integer> list) {
        //Base case
        if (queue.size() == 0) {
            return list;
        }

        BinaryTreeNode currentNode = queue.pop();
        list.add(currentNode.getValue());
        System.out.println(currentNode.getValue());

        //Add children of currentNode to the queue
        if (currentNode.getLeft() != null) {
            queue.add(currentNode.getLeft());
        }
        if (currentNode.getRight() != null) {
            queue.add(currentNode.getRight());
        }

        return breadthFirstSearchRecursion(queue, list);
    }

    public List<Integer> DFSInOrder() {
        List<Integer> list = new ArrayList<>(50); //This will be our return value
        return traverseInOrder(root, list);
    }

    private List<Integer> traverseInOrder(BinaryTreeNode node, List<Integer> list) {
        System.out.println(node.getValue());
        if (node.getLeft() != null) {
            traverseInOrder(node.getLeft(), list);
        }
        //We push the node into the list after processing the left nodes so that
        // our list will be in order.
        list.add(node.getValue());
        if (node.getRight() != null) {
            traverseInOrder(node.getRight(), list);
        }
        return list;
    }

    public List<Integer> DFSPostOrder() {
        List<Integer> list = new ArrayList<>(50); //This will be our return value
        return traverseInOrder(root, list);
    }

    private List<Integer> traversePostOrder(BinaryTreeNode node, List<Integer> list) {
        return null;


    }

    public List<Integer> DFSPreOrder() {
        List<Integer> list = new ArrayList<>(50); //This will be our return value
        return traverseInOrder(root, list);
    }

    private List<Integer> traversePreOrder(BinaryTreeNode node, List<Integer> list) {
        return null;


    }

    public BinaryTreeNode getRoot() {
        return root;
    }
}
