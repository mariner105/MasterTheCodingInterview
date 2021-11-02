package exercises;

import java.util.Arrays;

public class ThreeSumClosest {


    /**
     * This method sorts the input array and then uses 3 index pointers
     * to find the closest 3-integer sum to the target sum.
     * @param nums the array to search
     * @param target the target sum
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        //The following will change the order of nums array.  Consider working
        // on a clone of the array if that would be a problem.  (Though making a
        // clone of the array would increase both memory and time complexities.)
        Arrays.sort(nums);

        //index "i" moves us through the array
        for (int i=0; i< nums.length; i++) {
            int aPointer = i+1; //The element to the right of nums[i]
            int bPointer = nums.length -1; //The last element in the array
            while (aPointer < bPointer) {
                int currentSum = nums[i] + nums[aPointer] + nums[bPointer];
                if (currentSum > target ) {
                    //bPointer moves left
                    bPointer--;
                } else {
                    //aPointer moves right
                    aPointer++;
                }

                if (Math.abs(currentSum - target) < Math.abs(result - target)) {
                    result = currentSum;
                }
            }

        }

        return result;
    }
}
