package com.geek.algorithm.light.Algorithm.solution;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] result = new int[m][m];

        for (int i = 0; i < m; i++) {
            result[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            result[0][j] = 1;
        }

        for (int k = 1; k < m; k++) {
            for (int l = 1; l < n; l++) {
                result[k][l] = result[k-1][l] + result[k][l-1];
            }
        }
        return result[m-1][n-1];
    }
}
