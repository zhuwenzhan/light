package com.geek.algorithm.light.Algorithm.homework.thirdweek;

public class minPathSum {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid[0].length == 0 || grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; ++i) {
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for (int j = 1; j < columns; ++j) {
            dp[0][j] = grid[0][j] + dp[0][j-1];
        }
        for (int m = 1; m < rows; ++m){
            for (int n = 1; n < columns; ++n){
                dp[m][n] = Math.min(dp[m-1][n], dp[m][n-1]) + grid[m][n];
            }
        }
        return dp[rows - 1][columns - 1];
    }
}
