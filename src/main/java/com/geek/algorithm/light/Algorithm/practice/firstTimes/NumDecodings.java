package com.geek.algorithm.light.Algorithm.practice.firstTimes;

public class NumDecodings {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int len = s.length();
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i-1) == '1' || s.charAt(i-1) == '2') {
                    if (i == 1) dp[i] = 1;
                    else dp[i] = dp[i-2];
                } else {
                    return 0;
                }
            } else {
                int num = (s.charAt(i-1) - '0') * 10 + s.charAt(i) - '0';
                if (num >= 10 && num <= 26) {
                    if (i == 1) dp[i] = 2;
                    else dp[i] = dp[i-1] + dp[i-2];
                } else {
                    dp[i] = dp[i-1];
                }
            }
        }
        return dp[len-1];
    }
}
