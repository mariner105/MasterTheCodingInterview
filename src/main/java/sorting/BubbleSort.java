package sorting;

public class BubbleSort {

    public int[] sort(int[] array) {
        for (int iteration = 0; iteration <= array.length; iteration++) {
            boolean itemsFlipped = false;
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index+1]) {
                    //flip adjacent elements
                    itemsFlipped = true;
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
            if (!itemsFlipped) {
                break;
            }
        }

        return array;
    }
}
