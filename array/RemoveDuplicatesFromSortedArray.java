package array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        int currentValue = 0;
        int currentIndex = 0;
        boolean flag = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (flag) {
                currentIndex = i;
                currentValue = nums[i];
                flag = false;
            }

            if (nums[i + 1] != currentValue) {
                nums[currentIndex + 1] = nums[i + 1];
                currentValue = nums[i + 1];
                currentIndex = currentIndex + 1;
            }
        }
        return currentIndex + 1;
    }
}
