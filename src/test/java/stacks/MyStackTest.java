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
    }
}