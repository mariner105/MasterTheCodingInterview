package queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    MyQueue<String> queue;

    @BeforeEach
    public void setUp() {
        queue = new MyQueue<>();
    }

    @Test
    public void queueIsEmpty() {
        assertTrue(queue.isEmpty());
        assertNull(queue.peek());
    }

    @Test
    public void enqueue() {
        queue.enqueue("Google");
        assertEquals(1, queue.getLength());
        assertEquals("Google", queue.peek().getData());

        queue.enqueue("Discord");
        assertEquals(2, queue.getLength());
        assertEquals("Google", queue.peek().getData());

        queue.enqueue("Netflix");
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
        System.out.println(queue.toString());

        assertEquals("Google", queue.dequeue().getData());
        assertEquals(2, queue.getLength());

        assertEquals("Discord", queue.dequeue().getData());
        assertEquals(1, queue.getLength());

        assertEquals("Netflix", queue.dequeue().getData());
        assertEquals(0, queue.getLength());

        assertNull(queue.dequeue());
        assertEquals(0, queue.getLength());

        assertNull(queue.peek());

    }

}