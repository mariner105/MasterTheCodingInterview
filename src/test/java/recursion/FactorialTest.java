package recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void recursive(){
        assertEquals(24, factorial.findFactorialRecursive(4));
        assertEquals(120, factorial.findFactorialRecursive(5));
    }

    @Test
    public void iterative(){
        assertEquals(24, factorial.findFactorialIterative(4));
        assertEquals(120, factorial.findFactorialIterative(5));
    }
}