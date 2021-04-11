package com.geek.algorithm.light.Algorithm.homework.secondWeek;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int max = 0;
        if(length < 2) return 0;
        for(int i = 0; i < length-1; ++i){
            int temp = prices[i+1] - prices[i];
            if(temp > 0){
                max += temp;
            }
        }
        return max;
    }
}
