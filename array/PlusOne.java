package array;

/*
* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {2,3,6,5};
        int[] digits2 = {2,9,9,9};
        int[] digits3 = {9,9};
        int[] digits4 = {9,8,7,6,5,4,3,2,1,0};
        int[] digits5 = {0};
        int[] digits6 = {9};

        int[] result = plusOne(digits6);

        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] plusOne(int[] digits) {
        int[] newResult = new int[digits.length + 1];
        if (digits.length == 1 && digits[0] == 9) {
            return new int[] {1,0};
        }

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            }
        }

        if (digits[0] == 9) {
            newResult[0] = 1;
            for (int e = 1; e < digits.length; e++) {
                newResult[e] = 0;
            }
            return newResult;
        } else {
            digits[0] = digits[0] + 1;
            return digits;
        }
    }
}
