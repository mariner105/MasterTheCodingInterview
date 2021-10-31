package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    MergeSort mergeSort;

    @BeforeEach
    void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    public void testSort() {
        int[] array = {99,44,6,2,1,5,63,87,283,4,0};
        array = mergeSort.mergeSort(array);
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i] <= array[i+1]);
        }
    }
}