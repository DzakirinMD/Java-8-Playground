package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    /**
     * Finds two numbers in an array that sum up to the target value.
     * One brute force approach is to consider every pair of elements and check if their sum equals the target.
     * This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element,
     * and the inner loop iterates from the next element to the last element. However, this approach has a time complexity of O(n^2).
     *
     * @param nums   The array of integers.
     * @param target The target value.
     * @return An array of two indices representing the positions of the numbers that sum up to the target.
     * If no solution is found, an empty array is returned.
     */
    static int[] twoSum(int[] nums, int target) {
        int numsLength = nums.length;

        for (int i = 0; i < numsLength - 1; i++) {
            for (int j = i + 1; j < numsLength ; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // no solution
        return new int[]{};
    }
}
