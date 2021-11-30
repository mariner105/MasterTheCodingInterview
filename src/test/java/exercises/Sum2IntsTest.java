package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum2IntsTest {

    Sum2Ints sum2Ints;

    @BeforeEach
    void setUp() {
        sum2Ints = new Sum2Ints();
    }

    @Test
    public void case1() {
        assertEquals(3, sum2Ints.add(1,2));
    }

    @Test
    public void case2() {
        assertEquals(5, sum2Ints.add(2,3));
    }

}