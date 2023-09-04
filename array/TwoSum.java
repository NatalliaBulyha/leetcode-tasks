package array;

import java.util.HashMap;
import java.util.Map;

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.


Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
*
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
* */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums =  {0,3,-3,4,-1};
        int target = -1;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
       // K - value, V - index
        Map<Integer, Integer> numbers = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = numbers.get(target - nums[i]);
            }
            numbers.put(nums[i], i);
        }
        return result;
    }
}
