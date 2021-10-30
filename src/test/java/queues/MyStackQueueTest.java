package queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackQueueTest {
    MyStackQueue<String> queue;

    @BeforeEach
    public void setUp() {
        queue = new MyStackQueue<>();
    }

    @Test
    public void queueIsEmpty() {
        assertTrue(queue.isEmpty());
        assertNull(queue.peek());
    }

    @Test
    public void enqueue() {
        queue.enqueue("Google");
        System.out.println(queue.toString());
        assertEquals(1, queue.getLength());
        assertEquals("Google", queue.peek().getData());

        queue.enqueue("Discord");
        System.out.println(queue.toString());
        assertEquals(2, queue.getLength());
        assertEquals("Google", queue.peek().getData());

        queue.enqueue("Netflix");
        System.out.println(queue.toString());
        assertEquals(3, queue.getLength());
        assertEquals("Google", queue.peek().getData());

        System.out.println(queue.toString());
    }

    @Test
    public void dequeue() {
        queue.enqueue("Google");
        queue.enqueue("Discord");
        queue.enqueue("Netflix");
        System.out.println(queue.toString());
        assertEquals(3, queue.getLength());

        assertEquals("Google", queue.dequeue().getData());
        assertEquals(2, queue.getLength());
        System.out.println(queue.toString());

        assertEquals("Discord", queue.dequeue().getData());
        assertEquals(1, queue.getLength());
        System.out.println(queue.toString());

        assertEquals("Netflix", queue.dequeue().getData());
        assertEquals(0, queue.getLength());
        System.out.println(queue.toString());

        assertNull(queue.dequeue());
        assertEquals(0, queue.getLength());
        System.out.println(queue.toString());

        assertNull(queue.peek());

    }

}