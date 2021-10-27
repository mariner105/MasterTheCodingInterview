package linkedLists;

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
            tail.setNextNode(newNode);
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
        Node priorNode = search(index - 1);

        //Create new Node and take the next pointer
        // from priorNode
        Node newNode = new Node(value, priorNode.getNextNode());
        //Repoint priorNode to newNode
        priorNode.setNextNode(newNode);

        length++;

    }

    private Node search(int index) {
        Node currentNode = head;
        for (int i = 0; i < index && currentNode.getNextNode() != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        return currentNode;
    }

    public Node remove(int index) {
        //TODO add logic
        throw new RuntimeException("Need logic");
    }

    public Node get(int index) {
        //TODO add logic
        throw new RuntimeException("Need logic");
    }

    public int indexOf(Node searchNode) {
        //TODO add logic
        throw new RuntimeException("Need logic");
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
}
