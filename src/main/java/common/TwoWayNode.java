package common;

public class TwoWayNode {
    private int data;
    private TwoWayNode nextNode;
    private TwoWayNode priorNode;

    public TwoWayNode(int data, TwoWayNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.priorNode = null;
    }

    public TwoWayNode(int data, TwoWayNode nextNode, TwoWayNode priorNode) {
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

    public TwoWayNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(TwoWayNode nextNode) {
        this.nextNode = nextNode;
    }

    public TwoWayNode getPriorNode() {
        return priorNode;
    }

    public void setPriorNode(TwoWayNode priorNode) {
        this.priorNode = priorNode;
    }
}
