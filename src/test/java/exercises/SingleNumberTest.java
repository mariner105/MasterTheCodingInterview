package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    SingleNumber singleNumber;

    @BeforeEach
    void setUp() {
        singleNumber = new SingleNumber();
    }

    @Test
    public void testSingleElement() {
        assertEquals(1, singleNumber.singleNumber(new int[]{1}));
    }

    @Test
    public void testResult1() {
        assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    public void testResult4() {
        assertEquals(4, singleNumber.singleNumber(new int[]{4,1,2,1,2}));
    }



}