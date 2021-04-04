package com.geek.algorithm.light.Algorithm.homework.forthweek;

import java.util.Arrays;

public class climbStairs {
    public int climbStairs(int n) {

        if (n == 0) {
            return 0;
        }
        int[] counts = new int[n];
        Arrays.fill(counts, 1);
        counts[1] = 2;
        for (int i = 2; i < n; ++i) {
            counts[i] = counts[i-1] + counts[i-2];
        }
        return counts[n-1];
    }
}
