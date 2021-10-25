package arrays;

/**
 * Merge 2 sorted arrays into one larger array
 */
public class MergeSortedArrays {
    public static int[] mergeArrays(int[] array1, int[] array2) {
        //Validate inputs
        if (array1 == null || array2 ==null) {
            return null;
        }
        if (array1.length == 0) {
            return array2;
        }
        if (array2.length == 0) {
            return array1;
        }

        //Process the merge
        int[] merged = new int[array1.length + array2.length];
        int index1 = 0;
        int index2 = 0;
        int mergedIndex = 0;

        //Process until one array has been fully processed
        while (index1 < array1.length && index2 < array2.length) {
            if (array1[index1] <= array2[index2]) {
                merged[mergedIndex++] = array1[index1++];
            } else {
                merged[mergedIndex++] = array2[index2++];
            }
        }

        //One of the arrays might not have been fully processed at this point,
        // so we'll need to finish processing it
        if (index1 < array1.length) {
            for (int i = index1; i < array1.length; i++) {
                merged[mergedIndex++] = array1[i];
            }
        } else  {
            for (int i = index2; i < array2.length; i++) {
                merged[mergedIndex++] = array2[i];
            }
        }

        return merged;
    }
}
