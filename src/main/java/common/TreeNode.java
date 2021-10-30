package common;

public class TreeNode<T> {

    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;

    private final T data;

    public TreeNode(T data, TreeNode<T> leftChild, TreeNode<T> rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.data = data;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public T getData() {
        return data;
    }
}
