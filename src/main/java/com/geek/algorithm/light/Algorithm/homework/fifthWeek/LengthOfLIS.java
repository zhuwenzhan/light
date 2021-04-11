package com.geek.algorithm.light.Algorithm.homework.fifthWeek;

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {

        int max = 1;
        int len = nums.length;
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }

}
