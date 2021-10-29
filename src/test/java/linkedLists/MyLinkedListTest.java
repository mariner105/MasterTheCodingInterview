package linkedLists;

import common.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertEquals(15, myLinkedList.get(0).getData());
        assertEquals(99, myLinkedList.get(1).getData());
        assertEquals(5, myLinkedList.get(2).getData());

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

    @Test
    public void removeHead() {
        myLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22);
        System.out.println(myLinkedList.toString());
        myLinkedList.remove(0);
        assertEquals(3, myLinkedList.getLength());
        assertEquals(5, myLinkedList.get(0).getData());
        System.out.println(myLinkedList.toString());
    }

    @Test
    public void removeTail() {
        myLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22);
        System.out.println(myLinkedList.toString());
        Node temp =  myLinkedList.remove(myLinkedList.getLength() - 1);
        System.out.println(myLinkedList.toString());
        assertEquals(22, temp.getData());
        assertEquals(3, myLinkedList.getLength());
        assertEquals(10, myLinkedList.get(2).getData());
        System.out.println(myLinkedList.toString());
    }

    @Test
    public void removeInner() {
        myLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22)
                .append(55)
                .append(88);
        System.out.println(myLinkedList.toString());
        myLinkedList.remove(3);
        assertEquals(5, myLinkedList.getLength());
        assertEquals(55, myLinkedList.get(3).getData());
        System.out.println(myLinkedList.toString());
    }

    @Test
    public void reverseAList() {
        myLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22)
                .append(55)
                .append(88);

        System.out.println(myLinkedList.toString());
        MyLinkedList reversedList = myLinkedList.reverseAList(myLinkedList);
        String revString = reversedList.toString();
        System.out.println(revString);
        assertEquals(myLinkedList.getLength(), reversedList.getLength());
        assertEquals("88-->55-->22-->10-->5-->15", reversedList.toString());
    }

    @Test
    public void reverse() {
        myLinkedList
                .append(15)
                .append(5)
                .append(10)
                .append(22)
                .append(55)
                .append(88);
        int initialLength = myLinkedList.getLength();
        System.out.println(myLinkedList.toString());
        myLinkedList.reverse();
        System.out.println(myLinkedList.toString());

    }

}