package linkedLists;

/**
 * A doubly linked list to hold ints
 */
public class MyDoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public MyDoublyLinkedList(int value) {
        head = new Node(value, null);
        tail = this.head;
        length = 1;
    }

    /**
     * Add a new node to the end of the list
     * @param value the value to append to the list.
     * @return the newly appended node.
     */
    public MyDoublyLinkedList append(int value) {
        length++;

        //Append to an empty list
        if (head == null) {
            head = new Node(value, null, null);
            tail = head;
        } else {
            //Create a new node
            Node newNode = new Node(value,null, tail);

            //Update the current tail's next node to the new node
            tail.setNextNode(newNode);
            //Assign tail to the new node
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
            head = new Node(value, null, null);
            tail = head;
            return;
        }

        head = new Node(value, head, null);
    }

    public void insert(int index, int value) {
        //Prepending so use prepend method
        if (index == 0) {
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
        Node follower = priorNode.getNextNode();

        //Create new Node and take the next pointer
        // from priorNode
        Node newNode = new Node(value, priorNode.getNextNode(), priorNode);
        //Repoint priorNode and follower nodes to newNode
        priorNode.setNextNode(newNode);
        follower.setPriorNode(newNode);

        length++;
    }

    /**
     * Get the node at index.
     * @param index the index of the node
     * @return found node
     */
    public Node get(int index) {
        Node currentNode = head;
        for (int i = 0; i < index && currentNode.getNextNode() != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        return currentNode;
    }

    /**
     * This get starts from the tail and traverses backwards
     * @param index the index of the node
     * @return found node
     */
    public Node getReverse(int index) {
        Node currentNode = tail;
        for (int i = length - 1; i > index && currentNode.getPriorNode() != null; i--) {
            currentNode = currentNode.getPriorNode();
        }

        return currentNode;
    }

    public Node remove(int index) {
        length--;

        //index 0 is head node
        if (index <= 0) {
            Node temp = head;
            head = head.getNextNode();
            head.setPriorNode(null);
            return temp;
        }

        //index >= length is tail so repoint tail after
        // finding the previous node
        if (index >= length) {
            //Hold current tail
            Node temp = tail;
            //Find next to last node
            tail = tail.getPriorNode();
            //Set new tail's next node to null
            tail.setNextNode(null);
            //Return the old tail
            return temp;
        }

        Node priorNode = get(index - 1);
        Node nodeToRemove = priorNode.getNextNode();
        Node nextNode = nodeToRemove.getNextNode();
        priorNode.setNextNode(nextNode);
        nextNode.setPriorNode(priorNode);

        return nodeToRemove;
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
            if ( (currentNode.getNextNode() != null)) {
                stringBuilder.append("-->");
            }
            currentNode = currentNode.getNextNode();
        }

        return stringBuilder.toString();
    }

    public String printReversed() {
        StringBuilder stringBuilder = new StringBuilder(100);
        Node currentNode = tail;
        while (currentNode != null) {
            stringBuilder.append(currentNode.getData());
            if ( (currentNode.getPriorNode() != null)) {
                stringBuilder.append("-->");
            }
            currentNode = currentNode.getPriorNode();
        }

        return stringBuilder.toString();
    }
}
