package com.geek.algorithm.light.Algorithm.practice.firstTimes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int maxValue = 0;
        int maxSize = 1;
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);

                }
            }
            if (dp[i] > maxSize) {
                maxValue = nums[i];
                maxSize = dp[i];
            }
        }

        if (maxSize == 1) {
            res.add(nums[0]);
            return res;
        }

        for (int i = len - 1; i >= 0 &&maxSize > 0; i--) {
            if (dp[i] == maxSize && maxValue % nums[i] == 0) {
                maxValue = nums[i];
                res.add(maxValue);
                --maxSize;
            }
        }
        return res;


    }
}
