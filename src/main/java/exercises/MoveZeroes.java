package exercises;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//
//
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -231 <= nums[i] <= 231 - 1

public class MoveZeroes {

    public void move(int[] nums) {
        //Special case
        if (nums == null || nums.length < 2) {
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                //Move items to the left to replace the zero
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j-1] = nums[j];
                }
                //Move zero to the end
                nums[nums.length - 1] = 0;
            }
        }
    }
}
