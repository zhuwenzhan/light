package com.geek.algorithm.light.Algorithm.solution;

public class Row {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int i;
        for (i = 2; i < nums.length-1; ++i) {
            dp[i] = Math.max(dp[i-1], (dp[i-2] + nums[i]));
        }

        int[] dp2 = new int[nums.length];
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1], nums[2]);
        int j;
        for (j = 3; j < nums.length; ++j ) {
            dp2[j] = Math.max(dp2[j-1], (dp2[j-2] + nums[j]));
        }
        return Math.max(dp[i-1], dp2[j-1]);
    }
}
