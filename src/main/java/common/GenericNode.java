package common;

public class GenericNode<T> {
    private final T data;
    private GenericNode<T> next;

    public GenericNode(T data, GenericNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }

}
