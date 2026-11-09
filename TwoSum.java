import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
     * LeetCode Number 1 - Easy
     * 
     * You are given an array of integers nums and an integer target, return indices
     * of the two numbers such that they add up to target.
     * 
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     * 
     * You can return the answer in any order.
     * 
     * Constraints:
     * 
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Only one valid answer exists.
     * 
     * Expected outputs for the given examples:
     * 
     * -> [0,1]
     * -> [1,2]
     * -> [0,1]
     */

    public static void main(String[] args) {
        System.out.println(twoNumbers(new int[] { 2, 7, 11, 15 }, 9));
        System.out.println(twoNumbers(new int[] { 3, 2, 4 }, 6));
        System.out.println(twoNumbers(new int[] { 3, 3 }, 6));
    }

    static int[] twoNumbers(int[] nums, int target) {
        Map<Integer, Integer> twoNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (twoNumbers.containsKey(sum)) {
                return new int[] { twoNumbers.get(sum), i };
            }
            twoNumbers.put(nums[i], i);
        }
        return new int[] {};
    }
}