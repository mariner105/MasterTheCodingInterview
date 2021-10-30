package queues;

import common.GenericNode;

public class MyStackQueue<T> {

    private GenericNode<T> first;
    private GenericNode<T> last;
    private int length;

    public MyStackQueue() {
        this.last = null;
        this.first = null;
        this.length = 0;
    }

    public GenericNode<T> peek() {
        return first;
    }

    public MyStackQueue<T> enqueue(T item) {
        //Special case
        if (item == null) {
            return this;
        }

        last = new GenericNode<T>(item, last);
        if (length == 0) {
            first = last;
            first.setNext(null);
        }
        length++;
        return this;
    }

    public GenericNode<T> dequeue() {
        //Special case
        if (length == 0) {
            return null;
        }

        GenericNode<T> priorNode = getPriorNode();
        GenericNode<T> temp = first;
        first = priorNode;

        length--;
        if (length == 0) {
            first = null;
            last = null;
        }

        return temp;
    }

    private GenericNode<T> getPriorNode() {
        GenericNode<T> currentNode = last;
        for (int i = 0; i < length - 2; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
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
        GenericNode<T> currentNode = last;
        while (currentNode != null) {
            stringBuilder.append(currentNode.getData());
            stringBuilder.append("-->");
            if (currentNode.getNext() == null) {
                stringBuilder.append("null");
            }

            currentNode = currentNode.getNext();
        }

        return stringBuilder.toString();
    }
}
