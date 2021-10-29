package stacks;

import common.GenericNode;

public class MyStack {

    private GenericNode<String> top;
    private GenericNode<String> bottom;
    private int length;

    public MyStack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public GenericNode<String> peek() {
        return top;
    }

    public MyStack push(String item) {
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

    public GenericNode<String> pop() {
        //Special case
        if (top == null) {
            return null;
        }

        GenericNode<String> temp = top;
        top = top.getNext();
        if (top.getNext() == null) {
            bottom = top;
        }

        return top;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }
}
