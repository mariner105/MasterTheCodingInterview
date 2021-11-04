package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingAverageTest {

    MovingAverage movingAverage;

    @BeforeEach
    void setUp() {
        movingAverage = new MovingAverage(4);
    }

    @Test
    public void testFive() {
        assertEquals(2, movingAverage.next(2));
        assertEquals(5, movingAverage.next(8));
        assertEquals(5, movingAverage.next(5));
        assertEquals(6, movingAverage.next(9));
        assertEquals(17.75, movingAverage.next(49));

    }
}