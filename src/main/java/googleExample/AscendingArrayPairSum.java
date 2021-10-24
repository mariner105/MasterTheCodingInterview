package googleExample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers, search for a pair that sums to a target.
 * The items in the array are in ascending order.
 * There could be negatives.
 * There might not be a pair that sums to the target (return false).
 * Return true if a pair is found that sums to the target.
 */
public class AscendingArrayPairSum {

    /**
     * This method searches for a pair of items in an array that sum to
     * a target sum.
     * @param data An array of integers that are in any order.
     * @param targetSum The sum to find.
     * @return true if a matching pair was found.
     */
    public static boolean HasPairWithSum(int[] data, int targetSum) {
        Set<Integer> viewedItems = new HashSet<>();

        for (int i = 0; i < data.length ; i++) {
            int pairTarget = targetSum - data[i];
            System.out.println("item: " + data[i]);;
            if(viewedItems.contains(pairTarget)) {
                return true;
            }
            viewedItems.add(data[i]);
        }

        return false;
    }

}
