package array;

import java.util.HashMap;
import java.util.Map;

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
            if (target == nums[i] && numbers.containsKey(0)) {
                result[0] = i;
                result[1] = numbers.get(0);
            } else if (numbers.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = numbers.get(target - nums[i]);
            }
            numbers.put(nums[i], i);
        }
        return result;
    }
}
