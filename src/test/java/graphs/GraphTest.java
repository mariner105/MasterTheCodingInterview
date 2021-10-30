package graphs;

import common.GraphNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    private Graph graph;

    @BeforeEach
    void setUp() {
        graph = new Graph();
    }

    @Test
    public void createGraph() {
        graph
            .addVertex(new GraphNode('0'))
            .addVertex(new GraphNode('1'))
            .addVertex(new GraphNode('2'))
            .addVertex(new GraphNode('3'))
            .addVertex(new GraphNode('4'))
            .addVertex(new GraphNode('5'))
            .addVertex(new GraphNode('6'))
            .addEdge('3', '1')
            .addEdge('3', '4')
            .addEdge('4', '2')
            .addEdge('4', '5')
            .addEdge('1', '2')
            .addEdge('1', '0')
            .addEdge('0', '2')
            .addEdge('6', '5');

        graph.showConnections();
        assertEquals(7, graph.getNumberOfNodes());
    }
}