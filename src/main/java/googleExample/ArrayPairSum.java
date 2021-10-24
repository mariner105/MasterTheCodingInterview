package googleExample;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, search for a pair that sums to a target.
 * The items in the array are in ascending order.
 * There could be negatives.
 * There might not be a pair that sums to the target (return false).
 * Return true if a pair is found that sums to the target.
 */
public class ArrayPairSum {

    /**
     * This method searches for a pair of items in an array that sum to
     * a target sum.
     * This version stores the values that have been seen into a datastructure
     * that has an efficient lookup by value.
     * @param data An array of integers that are in any order.
     * @param targetSum The sum to find.
     * @return true if a matching pair was found.
     */
    public static boolean HasPairWithSum(int[] data, int targetSum) {
        //Check for null array
        if (data == null) {
            return false;
        }
        Set<Integer> viewedItems = new HashSet<>();

        for (int value : data)  {
            int pairTarget = targetSum - value;
            if(viewedItems.contains(pairTarget)) {
                return true;
            }
            viewedItems.add(value);
        }

        return false;
    }

    /**
     * This version stores the complements that have been seen into a datastructure
     * that has an efficient lookup by value.
     * @param data An array of integers that are in any order.
     * @param targetSum The sum to find.
     * @return true if a matching pair was found.
     */
    public static boolean HasPairWithSumStoreComps(int[] data, int targetSum) {
        //Check for null array
        if (data == null) {
            return false;
        }
        Set<Integer> compliments = new HashSet<>();

        for (int value : data) {
            if (compliments.contains(value)) {
                return true;
            }
            compliments.add(targetSum - value);
        }

        return false;
    }

}
