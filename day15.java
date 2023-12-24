https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int sum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Initialize maxSum with the sum of the first window
        int maxSum = sum;

        // Move the window through the array and update maxSum
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        // Calculate the maximum average
        double maxAverage = (double) maxSum / k;

        return maxAverage;
    }
}
