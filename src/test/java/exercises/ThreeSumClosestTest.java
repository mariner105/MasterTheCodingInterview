package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {

    ThreeSumClosest threeSumClosest;

    @BeforeEach
    void setUp() {
        threeSumClosest = new ThreeSumClosest();
    }

    @Test
    public void closestSum() {
        int[] array = {-12, 8, 10, 5, 1, 0, 2};
        int target = 8;
        int result = threeSumClosest.threeSumClosest(array, target);
        assertEquals(8, result);
    }

    @Test
    public void closestSum2() {
        int[] array = {-1, 2, 1, -4};
        int target = 1;
        int result = threeSumClosest.threeSumClosest(array, target);
        assertEquals(2, result);
    }
}