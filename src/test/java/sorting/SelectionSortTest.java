package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    SelectionSort selectionSort;

    @BeforeEach
    public void setUp() {
        selectionSort = new SelectionSort();
    }

    @Test
    public void sortArray() {
        int[] array = {8,5,2,6,9,3,1,4,0,7};
        selectionSort.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i] <= array[i+1]);
        }
    }

    @Test
    public void secondArray() {
        int[] array = {99,44,6,2,1,5,63,87,283,4,0};
        selectionSort.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i] <= array[i+1]);
        }
    }
}