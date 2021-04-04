package com.geek.algorithm.light.Algorithm.solution;

import java.util.Arrays;

public class coinChange {
    public int coinChange(int[] coins, int amount) {

        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        for (int i = 0; i < coins.length; ++i) {
            for (int j = 0; j < amount; ++j) {
                if(coins[i] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
