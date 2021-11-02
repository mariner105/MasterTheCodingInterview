package trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    BinarySearchTree tree;

    @BeforeEach
    void setUp() {
        tree = new BinarySearchTree();
    }

    @Test
    void insert() {
        tree
            .insert(9)
            .insert(4)
            .insert(6)
            .insert(20)
            .insert(170)
            .insert(15)
            .insert(1);

        System.out.println(tree.nodeToJson(tree.getRoot()));
    }

    @Test
    public void remove() {
        tree
            .insert(9)
            .insert(4)
            .insert(6)
            .insert(20)
            .insert(170)
            .insert(15)
            .insert(1);
        assertNull(tree.remove(0));
        assertEquals(20, tree.remove(20).getValue());
        System.out.println(tree.nodeToJson(tree.getRoot()));
    }

    @Test
    public void lookup() {
        assertNull(tree.lookup(20));

        tree
            .insert(9)
            .insert(4)
            .insert(6)
            .insert(20)
            .insert(170)
            .insert(15)
            .insert(1);
        assertEquals(20, tree.lookup(20).getValue());
        assertNull(tree.lookup(99999));
    }

    @Test
    public void nodeToJson() {
        tree
            .insert(9)
            .insert(4)
            .insert(6)
            .insert(20)
            .insert(170)
            .insert(15)
            .insert(1);

        System.out.println(tree.nodeToJson(tree.getRoot()));
    }

    @Test
    public void breadFirstSearch() {
        tree
                .insert(9)
                .insert(4)
                .insert(6)
                .insert(20)
                .insert(170)
                .insert(15)
                .insert(1);
        List<Integer> list = tree.breadthFirstSearch();
    }

    @Test
    public void breadthFirstSearchRecursive() {
        tree
                .insert(9)
                .insert(4)
                .insert(6)
                .insert(20)
                .insert(170)
                .insert(15)
                .insert(1);
        List<Integer> list = tree.breadthFirstSearchR();
    }

    @Test
    void DFSInOrder() {
        tree
                .insert(9)
                .insert(4)
                .insert(6)
                .insert(20)
                .insert(170)
                .insert(15)
                .insert(1);
        List<Integer> list = tree.DFSInOrder();
    }

    @Test
    void DFSPreOrder() {
        tree
                .insert(9)
                .insert(4)
                .insert(6)
                .insert(20)
                .insert(170)
                .insert(15)
                .insert(1);
        List<Integer> list = tree.DFSPreOrder();
        assertEquals(7, list.size());
    }

    @Test
    void DFSPostOrder() {
        tree
                .insert(9)
                .insert(4)
                .insert(6)
                .insert(20)
                .insert(170)
                .insert(15)
                .insert(1);
        List<Integer> list = tree.DFSPostOrder();
        assertEquals(7, list.size());
    }





}