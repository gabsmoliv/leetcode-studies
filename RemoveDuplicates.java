import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    /*
     * LeetCode Number 26 - Easy
     * 
     * Given an integer array nums sorted in non-decreasing order, remove the
     * duplicates in-place such that each unique element appears only once. The
     * relative order of the elements should be kept the same.
     * 
     * Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After
     * removing duplicates, return the number of unique elements k.
     * 
     * The first k elements of nums should contain the unique numbers in sorted
     * order. The remaining elements beyond index k - 1 can be ignored.
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 3 * 104
     * -100 <= nums[i] <= 100
     * nums is sorted in non-decreasing order.
     * 
     * Expected outputs for the given examples:
     * 
     * -> 2
     * -> 5
     */

    public static void main(String[] args) {
        System.out.println(containsDuplicates(new int[] { 1, 1, 2 }));
        System.out.println(containsDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
    }

    static boolean containsDuplicateWithSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }

    static boolean containsDuplicates(int[] nums) {
        Set<Integer> t = new HashSet<>(); // O(n) e O(1)
        for (int i = 0; i < nums.length; i++) {
            if (t.contains(nums[i])) {
                return true;
            } else {
                t.add(nums[i]);
            }
        }
        return false;
    }
}