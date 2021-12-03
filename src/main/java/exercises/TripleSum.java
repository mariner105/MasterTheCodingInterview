package exercises;

//Write a function that takes in a non empty array of distinct integers and a integer representing a target sum.
// The function should find all triplets in the array that sum up to the target sum and return a 2 dimensional
// array of all those triplets.
//
//        [ 12, 3, 1, 2, -6, 5, -8, 6]
//
//        target = 0
//
//        sample output:
//        [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripleSum {

   public List<int[]> tripleSum(int[] nums, int target) {


       // Special cases
       if (nums == null || nums.length < 3) {
           List<int[]> result = new ArrayList<int[]>();
           return result;
       }

       List<int[]> result = new ArrayList<>();
       Arrays.sort(nums);

       for (int i = 0; i < nums.length; i++) {
           int leftIndex = i + 1;
           int rightIndex = nums.length - 1;

           while (leftIndex < rightIndex) {
               int sum = nums[i] + nums[leftIndex] + nums[rightIndex];
               if (sum == target) {
                   result.add(new int[] {nums[i], nums[leftIndex], nums[rightIndex]});
                   leftIndex++;
               } else if (sum < target) {
                   leftIndex++;
               } else {
                   rightIndex--;
               }
           }
       }

       return result;
   }


}
