package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort bubbleSort;

    @BeforeEach
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void sortArray() {
        int[] array = {6,5,3,1,8,7,2,4};
        bubbleSort.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i] <= array[i+1]);
        }
    }

   @Test
    public void secondArray() {
        int[] array = {99,44,6,2,1,5,63,87,283,4,0};
        bubbleSort.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i] <= array[i+1]);
        }
    }

}