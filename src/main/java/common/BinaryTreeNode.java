package common;

public class BinaryTreeNode {

    private BinaryTreeNode left;
    private BinaryTreeNode right;

    private final int value;

    public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }
}
