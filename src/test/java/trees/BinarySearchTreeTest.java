package trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        System.out.println(tree.traverse(tree.getRoot()));
    }

    @Test
    public void lookup() {
        tree
                .insert(9)
                .insert(4)
                .insert(6)
                .insert(20)
                .insert(170)
                .insert(15)
                .insert(1);
        tree.lookup(20);
    }
}