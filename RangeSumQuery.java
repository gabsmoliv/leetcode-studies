public class RangeSumQuery {

    /*
     * LeetCode Number 303 - Easy
     * 
     * Given an integer array nums, handle multiple queries of the following type:
     * 
     * Calculate the sum of the elements of nums between indices left and right
     * inclusive where left <= right.
     * Implement the NumArray class:
     * 
     * NumArray(int[] nums) Initializes the object with the integer array nums.
     * int sumRange(int left, int right) Returns the sum of the elements of nums
     * between indices left and right inclusive (i.e. nums[left] + nums[left + 1] +
     * ... + nums[right]).
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 104
     * -105 <= nums[i] <= 105
     * 0 <= left <= right < nums.length
     * At most 104 calls will be made to sumRange.
     */

    class NumArray {
        private int[] prefix;

        public NumArray(int[] nums) {
            prefix = new int[nums.length + 1];
            for (int i = 1; i <= nums.length; i++) {
                prefix[i] = prefix[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            return prefix[right + 1] - prefix[left];
        }
    }
}