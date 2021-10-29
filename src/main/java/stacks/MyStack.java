package stacks;

import common.Node;

public class MyStack {

    private Node top;
    private Node bottom;
    private int length;

    public MyStack(Node top, Node bottom) {
        this.top = top;
        this.bottom = bottom;
        this.length = 0;
    }

    public Node getTop() {
        return top;
    }

    public Node getBottom() {
        return bottom;
    }

    public int getLength() {
        return length;
    }
}
