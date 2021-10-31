package sorting;

public class InsertionSort {

    public void sort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            if (array[i] < array[0]) {
                //Move number to the first position
                insertElement(array, 0, i);
            } else {
                //Find where number should go
                for (int j = 1; j < i; j++) {
                    if (array[i] > array[j-1] && array[i] < array[j]) {
                        insertElement(array,j, i);
                    }
                }
            }
        }
    }

    private void insertElement(int[] array, int insertionIndex, int j) {
        //array[j] needs to go where array[i] is located
        // so elements from index i need to shift up to index j

        //hold array[j] so that we can overwrite its element in the array
        int temp = array[j];

        //Move elements to the right
        for (int index = j - 1; index >= insertionIndex; index--) {
            array[index + 1] = array[index];
        }
        //Now store the element that we are inserting
        array[insertionIndex] = temp;
    }
}
