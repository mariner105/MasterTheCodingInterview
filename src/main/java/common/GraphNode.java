package common;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    private final char id;
    private final List<GraphNode> edges;

    public GraphNode(char id) {
        this.id = id;
        this.edges = new ArrayList<>(10);
    }

    public char getId() {
        return id;
    }

    public List<GraphNode> getEdges() {
        return edges;
    }

    public void addEdge(GraphNode node) {
        edges.add(node);
    }
}
