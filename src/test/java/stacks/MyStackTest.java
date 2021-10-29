package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A stack to hold Strings
 */
class MyStackTest {

    MyStack myStack;

    @BeforeEach
    public void setUp() {
        myStack = new MyStack();
    }

    @Test
    public void isEmpty() {
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void notEmpty() {
        myStack.push("Google");
        assertFalse(myStack.isEmpty());
    }

    //Sample stack to test
    //Discord
    //Udemy
    //Google

    @Test
    public void testPush() {
        myStack
            .push("Google")
            .push("Udemy")
            .push("Discord");
        assertEquals(3, myStack.getLength());
        assertEquals("Discord", myStack.peek().getData());
        System.out.println(myStack.toString());
    }

    @Test
    public void testPopEmptyStack() {
        assertNull(myStack.pop());
    }

    @Test
    public void testPop() {
        myStack
            .push("Google")
            .push("Udemy")
            .push("Discord");
        assertEquals("Discord", myStack.pop().getData());
        assertEquals("Udemy", myStack.pop().getData());
        assertEquals("Google", myStack.pop().getData());
        assertTrue(myStack.isEmpty());
    }
}