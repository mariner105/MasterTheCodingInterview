package recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void iterative() {
        System.out.println(fibonacci.fibonacciIterative(8));
        System.out.println(fibonacci.fibonacciIterative(5));
        System.out.println(fibonacci.fibonacciIterative(4));
        System.out.println(fibonacci.fibonacciIterative(3));
        System.out.println(fibonacci.fibonacciIterative(2));
        System.out.println(fibonacci.fibonacciIterative(1));

        assertEquals(2, fibonacci.fibonacciIterative(3));
        assertEquals(21, fibonacci.fibonacciIterative(8));

        System.out.println(fibonacci.fibonacciIterative(43));
    }

    @Test
    public void recursive() {
        System.out.println(fibonacci.fibonacciRecursive(8));
        System.out.println(fibonacci.fibonacciRecursive(5));
        System.out.println(fibonacci.fibonacciRecursive(4));
        System.out.println(fibonacci.fibonacciRecursive(3));
        System.out.println(fibonacci.fibonacciRecursive(2));
        System.out.println(fibonacci.fibonacciRecursive(1));

        assertEquals(2, fibonacci.fibonacciRecursive(3));
        assertEquals(21, fibonacci.fibonacciRecursive(8));

        System.out.println(fibonacci.fibonacciIterative(43));
    }


}