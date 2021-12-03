package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TripleSumTest {
    TripleSum tripleSum;

    @BeforeEach
    void setUp() {
        tripleSum = new TripleSum();
    }

    @Test
    public void sample() {
        int[] nums = new int[] {12, 3, 1, 2, -6, 5, -8, 6};
        tripleSum.tripleSum(nums, 0);
    }
}