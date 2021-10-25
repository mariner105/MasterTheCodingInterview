package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {

    @Test
    public void nullArrays() {
        assertNull(MergeSortedArrays.mergeArrays(null, null));
    }

    @Test
    public void emptyArray1() {
        int[] array1 = {};
        int[] array2 = {4,6,30};
        int[] expected = {4,6,30};

        assertTrue(
                validate(expected,
                        MergeSortedArrays.mergeArrays(array1, array2)));
    }

    @Test
    public void emptyArray2() {
        int[] array1 = {0,3,4,31};
        int[] array2 = {};
        int[] expected = {0,3,4,31};

        assertTrue(
                validate(expected,
                MergeSortedArrays.mergeArrays(array1, array2)));

    }

    @Test
    public void firstArrayBigger() {
        int[] array1 = {0,3,4,31};
        int[] array2 = {4,6,30};
        int[] expected = {0,3,4,4,6,30,31};

        assertTrue(
                validate(expected,
                MergeSortedArrays.mergeArrays(array1, array2)));

    }

    @Test
    public void secondArrayBigger() {
        int[] array1 = {4,6,30};
        int[] array2 = {0,3,4,31};
        int[] expected = {0,3,4,4,6,30,31};

        assertTrue(
                validate(expected,
                MergeSortedArrays.mergeArrays(array1, array2)));

    }

    @Test
    public void equalLengths() {
        int[] array1 = {4,6,30, 77};
        int[] array2 = {0,3,4,31};
        int[] expected = {0,3,4,4,6,30,31,77};

        assertTrue(
                validate(expected,
                MergeSortedArrays.mergeArrays(array1, array2)));

    }

    private boolean validate(int[] expected, int[] mergedArray) {
        if (expected == null || mergedArray == null) {
            return  false;
        }
        if (expected.length != mergedArray.length) {
            return false;
        }
        for (int i = 0; i < mergedArray.length; i++) {
            if (expected[i] != mergedArray[i]) {
                return false;
            }
        }

        return true;
    }

}