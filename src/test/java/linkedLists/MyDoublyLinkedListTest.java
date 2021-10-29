package linkedLists;

import common.TwoWayNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyDoublyLinkedListTest {

    public MyDoublyLinkedList myDblLinkedList;

    @BeforeEach
    void setUp() {
        myDblLinkedList = new MyDoublyLinkedList();
    }

    @Test
    public void newListIsEmpty() {
        assertTrue(myDblLinkedList.isEmpty());
        assertEquals(0, myDblLinkedList.getLength());
    }

    @Test
    public void createListWithAnItem() {
        myDblLinkedList = new MyDoublyLinkedList(10);
        assertFalse(myDblLinkedList.isEmpty());
        assertEquals(10, myDblLinkedList.get(0).getData());
    }

    @Test
    public void addItemToEmptyList() {
        myDblLinkedList.append(5);
        assertEquals(1, myDblLinkedList.getLength());
    }

    @Test
    public void addItemToNonEmptyList() {
        myDblLinkedList = new MyDoublyLinkedList(10);
        myDblLinkedList.append(5);
        assertEquals(2, myDblLinkedList.getLength());
    }

    @Test
    public void chainAppends() {
        myDblLinkedList
                .append(15)
                .append(5)
                .append(10);
        assertEquals(3, myDblLinkedList.getLength());
        assertEquals("10-->5-->15", myDblLinkedList.printReversed());
        System.out.println(myDblLinkedList.printReversed());
    }

    @Test
    public void testGetReversed() {
        myDblLinkedList
                .append(15)
                .append(5)
                .append(10);
        assertEquals(15, myDblLinkedList.getReverse(0).getData());
        assertEquals(5, myDblLinkedList.getReverse(1).getData());
        assertEquals(10, myDblLinkedList.getReverse(2).getData());
    }

    @Test
    public void prependToEmptyList() {
        myDblLinkedList.prepend(56);
        assertFalse(myDblLinkedList.isEmpty());
        assertEquals(1, myDblLinkedList.getLength());
    }

    @Test
    public void prependToNonEmptyList() {
        myDblLinkedList
                .append(15)
                .append(5)
                .append(10);
        System.out.println(myDblLinkedList.toString());

        myDblLinkedList.prepend(56);
        assertFalse(myDblLinkedList.isEmpty());
        assertEquals(4, myDblLinkedList.getLength());

        System.out.println(myDblLinkedList.toString());
    }

    @Test
    public void insert() {
        myDblLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22);
        System.out.println(myDblLinkedList.toString());

        myDblLinkedList.insert(1, 99);
        System.out.println(myDblLinkedList.toString());
        assertEquals(5, myDblLinkedList.getLength());
        assertEquals(15, myDblLinkedList.get(0).getData());
        assertEquals(99, myDblLinkedList.get(1).getData());
        assertEquals(5, myDblLinkedList.get(2).getData());

        myDblLinkedList.insert(150, 200);
        System.out.println(myDblLinkedList.toString());
        assertEquals(6, myDblLinkedList.getLength());

        myDblLinkedList.insert(myDblLinkedList.getLength(), 300);
        System.out.println(myDblLinkedList.toString());
        assertEquals(7, myDblLinkedList.getLength());


        myDblLinkedList.insert(0, 222);
        System.out.println(myDblLinkedList.toString());
        assertEquals(8, myDblLinkedList.getLength());
    }

    @Test
    public void removeHead() {
        myDblLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22);
        System.out.println(myDblLinkedList.toString());
        myDblLinkedList.remove(0);
        assertEquals(3, myDblLinkedList.getLength());
        assertEquals(5, myDblLinkedList.get(0).getData());
        System.out.println(myDblLinkedList.toString());
        System.out.println(myDblLinkedList.printReversed());
        assertEquals("22-->10-->5", myDblLinkedList.printReversed());
    }

    @Test
    public void removeTail() {
        myDblLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22);
        System.out.println(myDblLinkedList.toString());
        TwoWayNode temp =  myDblLinkedList.remove(myDblLinkedList.getLength() - 1);
        assertEquals(22, temp.getData());
        assertEquals(3, myDblLinkedList.getLength());
        assertEquals(10, myDblLinkedList.get(2).getData());
        System.out.println(myDblLinkedList.toString());
        System.out.println(myDblLinkedList.printReversed());
    }

    @Test
    public void removeInner() {
        myDblLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22)
                .append(55)
                .append(88);
        System.out.println(myDblLinkedList.toString());
        myDblLinkedList.remove(3);
        assertEquals(5, myDblLinkedList.getLength());
        assertEquals(55, myDblLinkedList.get(3).getData());
        System.out.println(myDblLinkedList.toString());
        System.out.println(myDblLinkedList.printReversed());
        assertEquals("88-->55-->10-->5-->15", myDblLinkedList.printReversed());
    }

    @Test
    public void findHeadInReverse() {
        myDblLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22)
                .append(55)
                .append(88);
        System.out.println(myDblLinkedList.toString());
        assertEquals(15, myDblLinkedList.getReverse(0).getData());

        //Remove value 10 and retest
        myDblLinkedList.remove(2);
        System.out.println(myDblLinkedList.toString());
        assertEquals(15, myDblLinkedList.getReverse(0).getData());

        //Remove value 88 and retest
        myDblLinkedList.remove(4);
        System.out.println(myDblLinkedList.toString());
        assertEquals(15, myDblLinkedList.getReverse(0).getData());

        //Remove value 15 and retest
        myDblLinkedList.remove(0);
        System.out.println(myDblLinkedList.toString());
        assertEquals(5, myDblLinkedList.getReverse(0).getData());
    }

    @Test
    public void findHeadAfterInserts() {
        myDblLinkedList
                .append(15)
                .append(5)
                .append(10)
                .insert(1, 4);
        System.out.println(myDblLinkedList.toString());
        System.out.println(myDblLinkedList.printReversed());
        assertEquals(15, myDblLinkedList.getReverse(0).getData());
    }

}