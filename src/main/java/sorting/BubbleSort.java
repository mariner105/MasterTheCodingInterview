package sorting;

public class BubbleSort {

    public int[] sort(int[] array) {
        int length = array.length;
        for (int iteration = 0; iteration <= length; iteration++) {
            boolean itemsSwapped = false;
            for (int index = 0; index < length - 1; index++) {
                if (array[index] > array[index+1]) {
                    //Swap adjacent elements
                    itemsSwapped = true;
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
            if (!itemsSwapped) {
                break;
            }
        }

        return array;
    }
}
