package graphs;

import common.GraphNode;

import java.util.*;

public class Graph {

    private int numberOfNodes;
    private Map<Character, GraphNode> adjacentList;

    public Graph() {
        this.numberOfNodes = 0;
        this.adjacentList = new Hashtable<>();
    }

    public Graph addVertex(GraphNode node) {
        adjacentList.put(node.getId() ,node);
        numberOfNodes++;

        return this;
    }

    public Graph addEdge(char id1, char id2) {
        //Undirected graph
        GraphNode node1 = adjacentList.get(id1);
        GraphNode node2 = adjacentList.get(id2);
        node1.addEdge(node2);
        node2.addEdge(node1);

        return this;
    }

    public void showConnections() {
        Collection<GraphNode> allNodes = adjacentList.values();
        for (GraphNode node : allNodes) {
            List<GraphNode> nodeConnections = node.getEdges();
            StringBuilder connections = new StringBuilder(100);
            for (GraphNode vertex : nodeConnections) {
                connections.append(vertex.getId()).append(" ");
            }
            System.out.println(node.getId() + "-->" +connections.toString());
        }
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }
}
