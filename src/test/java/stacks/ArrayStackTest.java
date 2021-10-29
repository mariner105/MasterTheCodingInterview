package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    ArrayStack arrayStack;

    @BeforeEach
    public void setUp() {
        arrayStack = new ArrayStack();
    }

    @Test
    public void isEmpty() {
        assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void notEmpty() {
        arrayStack.push("Google");
        assertFalse(arrayStack.isEmpty());
    }

    //Sample stack to test
    //Discord
    //Udemy
    //Google

    @Test
    public void testPush() {
        arrayStack
                .push("Google")
                .push("Udemy")
                .push("Discord");
        assertEquals(3, arrayStack.getLength());
        assertEquals("Discord", arrayStack.peek());
        System.out.println(arrayStack.toString());
    }

    @Test
    public void testPopEmptyStack() {
        assertNull(arrayStack.pop());
    }

    @Test
    public void testPop() {
        arrayStack
                .push("Google")
                .push("Udemy")
                .push("Discord");
        assertEquals("Discord", arrayStack.pop());
        assertEquals("Udemy", arrayStack.pop());
        assertEquals("Google", arrayStack.pop());
        assertTrue(arrayStack.isEmpty());
    }
}