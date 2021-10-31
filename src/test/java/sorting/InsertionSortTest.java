package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    InsertionSort insertionSort;

    @BeforeEach
    void setUp() {
        insertionSort = new InsertionSort();
    }

    @Test
    public void testSort() {
        int[] array = {99,44,6,2,1,5,63,87,283,4,0};
        insertionSort.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i] <= array[i+1]);
        }
    }
}