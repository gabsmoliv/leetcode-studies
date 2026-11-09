public class FindPivotIndex {

    /*
     * LeetCode Number 724 - Easy
     * 
     * Given an array of integers nums, calculate the pivot index of this array.
     * 
     * The pivot index is the index where the sum of all the numbers strictly to the
     * left of the index is equal to the sum of all the numbers strictly to the
     * index's right.
     * 
     * If the index is on the left edge of the array, then the left sum is 0 because
     * there are no elements to the left. This also applies to the right edge of the
     * array.
     * 
     * Return the leftmost pivot index. If no such index exists, return -1.
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 104
     * -1000 <= nums[i] <= 1000
     * 
     * Expected outputs for the given examples:
     * -> 3
     * -> -1
     * -> 0
     */

    public static void main(String[] args) {
        pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 });
        pivotIndex(new int[] { 1, 2, 3 });
        pivotIndex(new int[] { 2, 1, -1 });
    }

    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (Integer t : nums) {
            total += t;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
