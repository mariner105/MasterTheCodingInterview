package queues;

import common.GenericNode;

/**
 * This is a FIFO data structure.
 *
 */
public class MyQueue<T> {

    private GenericNode<String> first;
    private GenericNode<String> last;
    private int length;

    public MyQueue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    /**
     * O(1)
     */
    public void enqueue(String value) {
        GenericNode<String> newNode =
            new GenericNode<String>(value, last == null ? null : last.getNext());
        if (length == 0) {
            //Set the first node in the queue
            first = newNode;
            last = first;
        } else {
            //Add to the end of the queue (last.next)
            if (last != null) {
                last.setNext(newNode);
            }
            last = newNode;
        }
        length++;
    }

    /**
     * O(1)
     */
    public GenericNode<String> dequeue() {
        //remove from the beginning of the queue
        if (length == 0) {
            return null;
        }

        //Store a copy of first
        GenericNode<String> temp = first;
        //Repoint first;
        first = first.getNext();
        length--;
        //When there are only 0 or 1 nodes then last should equal first
        if (length < 2)
        {
            last = first;
        }

        //Return the copy
        return temp;
    }

    /**
     * O(1)
     */
    public GenericNode<String> peek() {
        return first;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(150);
        GenericNode<String> currentNode = first;
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
