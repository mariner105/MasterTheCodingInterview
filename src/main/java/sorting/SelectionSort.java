package sorting;

public class SelectionSort {

    public int[] sort(int[] array){

        int length = array.length;
        for (int i = 0; i < length; i++) {
            int smallest = 999999999;
            int indexOfSmallest = 0;
            for (int j = i; j < length; j++) {
                if (array[j] < smallest) {
                    smallest = array[j];
                    indexOfSmallest = j;
                }
            }
            //swap smallest element with element i
            int temp = array[i];
            array[i] = smallest;
            array[indexOfSmallest] = temp;
        }

        return array;
    }
}
