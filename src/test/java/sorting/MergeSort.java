package sorting;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] array) {
        int length = array.length;
        //Base case
        if (length == 1) {
            return array;
        }

        //Split array into right and left
        int midpoint = length / 2;
        int[] left = Arrays.copyOfRange(array, 0, midpoint);
        int[] right = Arrays.copyOfRange(array, midpoint, length);
        return merge(
                mergeSort(left),
                mergeSort(right));
    }

    private int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                mergedArray[mergedIndex++] = left[leftIndex++];
            } else {
                mergedArray[mergedIndex++] = right[rightIndex++];
            }
        }

        //Finish processing whichever array didn't get fully copied into the new array
        if (leftIndex < left.length) {
            for (int i = leftIndex; i < left.length; i++) {
                mergedArray[mergedIndex++] = left[i];
            }
        } else if (rightIndex < right.length) {
            for (int i = rightIndex; i < right.length; i++) {
                mergedArray[mergedIndex++] = right[i];
            }
        }

        return mergedArray;
    }

}
