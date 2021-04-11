package com.geek.algorithm.light.Algorithm.solution;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        for (int i = 0; i < len; ++i) {
            int temp = 0;
                for (int j = i; j < len ; ++j) {
                    temp = temp + nums[j];
                    max = Math.max(max, temp);
                }
        }
        return max;
    }
}
