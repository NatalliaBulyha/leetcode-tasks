package array;

/*
* Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
* return the index where it would be if it were inserted in order.
*
* Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
*
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
*
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
* */

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int target2 = 2;
        int target3 = 7;
        System.out.println(searchInsert(nums, target2));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                return index;
            } else if (i == 0 && target < nums[i]) {
                index = i;
                return index;
            } else if (i != 0 && target < nums[i]) {
                index = i;
                return index;
            } else if(i == nums.length - 1 && target > nums[i]) {
                index = i + 1;
                return index;
            }
        }
        return index;
    }
}
