package linkedLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    public MyLinkedList myLinkedList;

    @BeforeEach
    public void setUp() {
        myLinkedList = new MyLinkedList();
    }

    @Test
    public void isEmpty() {
        assertTrue(myLinkedList.isEmpty());
    }

    @Test
    public void createListWithAnItem() {
        myLinkedList = new MyLinkedList(10);
        assertFalse(myLinkedList.isEmpty());
    }

    @Test
    public void addItemToEmptyList() {
        myLinkedList.append(5);
        assertEquals(1, myLinkedList.getLength());
    }

    @Test
    public void addItemToNonEmptyList() {
        myLinkedList = new MyLinkedList(10);
        myLinkedList.append(5);
        assertEquals(2, myLinkedList.getLength());
    }

    @Test
    public void chainAppends() {
        myLinkedList
                .append(15)
                .append(5)
                .append(10);
        assertEquals(3, myLinkedList.getLength());
    }

    @Test
    public void prependToEmptyList() {
        myLinkedList.prepend(56);
        assertFalse(myLinkedList.isEmpty());
        assertEquals(1, myLinkedList.getLength());
    }

    @Test
    public void prependToNonEmptyList() {
        myLinkedList
                .append(15)
                .append(5)
                .append(10);
        System.out.println(myLinkedList.toString());

        myLinkedList.prepend(56);
        assertFalse(myLinkedList.isEmpty());
        assertEquals(4, myLinkedList.getLength());

        System.out.println(myLinkedList.toString());
    }

    @Test
    public void insert() {
        myLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22);
        System.out.println(myLinkedList.toString());

        myLinkedList.insert(1, 99);
        System.out.println(myLinkedList.toString());
        assertEquals(5, myLinkedList.getLength());

        myLinkedList.insert(150, 200);
        System.out.println(myLinkedList.toString());
        assertEquals(6, myLinkedList.getLength());

        myLinkedList.insert(myLinkedList.getLength(), 300);
        System.out.println(myLinkedList.toString());
        assertEquals(7, myLinkedList.getLength());


        myLinkedList.insert(0, 222);
        System.out.println(myLinkedList.toString());
        assertEquals(8, myLinkedList.getLength());


    }

}