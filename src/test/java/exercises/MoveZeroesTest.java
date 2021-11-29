package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoveZeroesTest {

    MoveZeroes moveZeroes;

    @BeforeEach
    void setUp() {
        moveZeroes = new MoveZeroes();
    }

    @Test
    public void testNull() {
        int[] nums = null;
        moveZeroes.move(nums);
        assertNull(nums);
    }

    @Test
    public void singleItemZero() {
        int[] nums = new int[] {0};
        int[] expected = new int[] {0};
        moveZeroes.move(nums);
        assertTrue(areArraysEqual(expected, nums));
    }

    @Test
    public void singleItemNonZero() {
        int[] nums = new int[] {10};
        int[] expected = new int[] {10};
        moveZeroes.move(nums);
        assertTrue(areArraysEqual(expected, nums));
    }

    @Test
    public void case1() {
        int[] nums = new int[] {0,1,0,3,12};
        int[] expected = new int[] {1,3,12,0,0};
        moveZeroes.move(nums);
        assertTrue(areArraysEqual(expected, nums));
    }

    @Test
    public void case2() {
        int[] nums = new int[] {0};
        int[] expected = new int[] {0};
        moveZeroes.move(nums);
        assertTrue(areArraysEqual(expected, nums));
    }

    /**
     * Compare the elements of each array
     * @param arr1 array of char
     * @param arr2 array of char
     * @return true if each element of arr1 equals the
     * corresponding element in arr2, false otherwise.
     */
    private boolean areArraysEqual(int[] arr1, int[] arr2) {
        //Special case
        if (arr2 == null || arr1 == null || arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}