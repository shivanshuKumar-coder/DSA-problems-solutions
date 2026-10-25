// Title: Maximum Absolute Sum of Any Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/

            minSum = Math.min(nums[i], minSum + nums[i]);
        for (int i = 1; i < nums.length; i++) {

        int minSum = nums[0];
        int ans = Math.abs(nums[0]);
class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxSum = nums[0];
            maxSum = Math.max(nums[i], maxSum + nums[i]);

            int absSum = Math.max(Math.abs(maxSum), Math.abs(minSum));
            ans = Math.max(ans, absSum);

        }
        return ans;
    }
}
