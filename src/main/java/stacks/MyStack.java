package stacks;

import common.GenericNode;

public class MyStack<T> {

    private GenericNode<T> top;
    private GenericNode<T> bottom;
    private int length;

    public MyStack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public GenericNode<T> peek() {
        return top;
    }

    public MyStack<T> push(T item) {
        //Special case
        if (item == null) {
            return this;
        }

        top = new GenericNode<>(item, top);
        if (bottom == null) {
            bottom = top;
        }
        length++;
        return this;
    }

    public GenericNode<T> pop() {
        //Special case
        if (top == null) {
            return null;
        }

        GenericNode<T> temp = top;
        top = top.getNext();
        if (top == null) {
            bottom = null;
        }

        length--;
        return temp;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        GenericNode<T> currentNode = top;
        while (currentNode != null) {
            stringBuilder.append(currentNode.getData());
            if (currentNode.getNext() != null) {
                stringBuilder.append("\n");
            }

            currentNode = currentNode.getNext();
        }

        return stringBuilder.toString();
    }
}
