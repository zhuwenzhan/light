package com.geek.algorithm.light.Algorithm.practice.firstTimes;

import java.util.Arrays;

public class MaxSumSubmatrix {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dp = new int[(row-k)*(col-k)];
        int count = 0;

        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                int num = 0;
                for (int i = m; i < k; i++) {
                    for (int j = n; j < k; j++) {
                        num = num+matrix[i][j];
                    }
                }
                dp[count++] = num;
            }
        }
        Arrays.sort(dp);
        return dp[count - 1];
    }
}
