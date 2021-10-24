package googleExample;

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
     * a target sum
     * @param data An array of integers in ascending order.
     * @param targetSum
     * @return
     */
    public static boolean HasPairWithSum(int[] data, int targetSum) {
        int lowIndex = 0;
        int highIndex = data.length - 1;

        while (lowIndex < highIndex) {
            //TODO remove these testcode variables
            int lowItem =data[lowIndex];
            int highItem =data[highIndex];

            if (data[lowIndex] + data[highIndex] == targetSum) {
                return true;
            }
            if (data[lowIndex] > 0 && data[highIndex] > targetSum) {
                highIndex--;
            } else {
                lowIndex++;
            }
        }

        return false;
    }

}
