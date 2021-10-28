package linkedLists;

public class Node {
    private int data;
    private Node nextNode;
    private Node priorNode;

    public Node(int data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.priorNode = null;
    }

    public Node(int data, Node nextNode, Node priorNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.priorNode = priorNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPriorNode() {
        return priorNode;
    }

    public void setPriorNode(Node priorNode) {
        this.priorNode = priorNode;
    }
}
