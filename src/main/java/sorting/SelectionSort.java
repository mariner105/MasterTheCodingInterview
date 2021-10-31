package sorting;

public class SelectionSort {

    public void sort(int[] array){

        int length = array.length;
        for (int i = 0; i < length; i++) {
            //Set current index as minimum
            int min = i;
            int temp = array[i];
            for (int j = i+1; j < length; j++) {
                //Update minimum if current is lower than what we had previously
                if (array[j] < array[min]) {
                    array[min] = array[j];
                    min = j;
                }
            }
            //swap smallest element with element i
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
