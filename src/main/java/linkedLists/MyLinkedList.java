package linkedLists;

import common.Node;
import common.Node;
import common.Node;

/**
 * A linked list to hold ints
 */
public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public MyLinkedList(int value) {
        head = new Node(value, null);
        tail = this.head;
        length = 1;
    }

    /**
     * Add a new node to the end of the list
     * @param value the value to append to the list.
     * @return the newly appended node.
     */
    public MyLinkedList append(int value) {
        length++;

        //Append to an empty list
        if (head == null) {
            head = new Node(value, null);
            tail = head;
        } else {
            //Create a new node
            Node newNode = new Node(value,null);
            //Update the current tail's next node to the new node
            tail.setNext(newNode);
            //Point tail to the new node
            tail = newNode;
        }

        return this;
    }

    /**
     * Prepend a value to the head of the list.
     * @param value the value to prepend to the list.
     */
    public void prepend(int value) {
        length++;

        //Prepend to empty list (repoints tail)
        if (head == null) {
            head = new Node(value, null);
            tail = head;
            return;
        }

        head = new Node(value, head);
    }

    public void insert(int index, int value) {
        //Prepending so use prepend method
        if(index == 0) {
            prepend(value);
            return;
        }

        //Insert at or beyond the end of the list so
        //call append method.
        if (index >= length) {
            append(value);
            return;
        }

        //Iterate until we find the element to the left
        // of the index (index - 1)
        Node priorNode = get(index - 1);

        //Create new Node and take the next pointer
        // from priorNode
        Node newNode = new Node(value, priorNode.getNext());
        //Repoint priorNode to newNode
        priorNode.setNext(newNode);

        length++;

    }

    public Node get(int index) {
        Node currentNode = head;
        for (int i = 0; i < index && currentNode.getNext() != null; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    public Node remove(int index) {
        length--;

        //index 0 is head node
        if (index <= 0) {
            Node temp = head;
            head = head.getNext();
            return temp;
        }

        //index >= length is tail so repoint tail after
        // finding the previous node
        if (index >= length) {
            //Hold current tail
            Node temp = tail;
            //Find next to last node
            tail = get(length - 1);
            //Set new tail's next node to null
            tail.setNext(null);
            //Return the old tail
            return temp;
        }

        Node priorNode = get(index - 1);
        Node nodeToRemove = priorNode.getNext();
        priorNode.setNext(nodeToRemove.getNext());

        return nodeToRemove;
    }

    /**
     * Reverse this linked list
     */
    public void reverse() {
        if (head.getNext() == null) {
            return;
        }

        Node first = head;
        System.out.println("First:" + first.getData());
        tail = head;
        System.out.println("Tail:" + tail.getData());
        Node second = first.getNext();
        System.out.println("Second:" + second.getData());
        System.out.println("-----");
        while (second != null) {
            Node temp = second.getNext();
            System.out.println("\tTemp:" + (temp == null ? null : temp.getData()));
            second.setNext(first);
            System.out.println("\tSecond:" + second.getData());
            first = second;
            System.out.println("\tFirst:" + first.getData());
            second = temp;
            System.out.println("\tSecond: " + (second == null ? null : second.getData()));
            System.out.println("-----");
        }

        head.setNext(null);
        head = first;
        System.out.println("Head:" + head.getData());
    }

    /**
     * Given a linked list as input, we want to return a linked list that has
     * the items in reversed order.
     * @param list
     * @return
     */
    public MyLinkedList reverseAList(MyLinkedList list) {
        //Special cases
        if (list == null || list.length == 0) {
            return list;
        }

        MyLinkedList reversedList = new MyLinkedList();
        Node currentNode = list.head;
        while (currentNode != null) {
            reversedList.prepend(currentNode.getData());
            currentNode = currentNode.getNext();
        }
        return reversedList;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        Node currentNode = head;
        while (currentNode != null) {
            stringBuilder.append(currentNode.getData());
            if ( (currentNode.getNext() != null)) {
                stringBuilder.append("-->");
            }
            currentNode = currentNode.getNext();
        }

        return stringBuilder.toString();
    }
}
