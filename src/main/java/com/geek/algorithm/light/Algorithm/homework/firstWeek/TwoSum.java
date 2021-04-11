package com.geek.algorithm.light.Algorithm.homework.firstWeek;

/**
 * 1. 两数之和
 */
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        int numberSize = nums.length;
        for(int i = 0; i< numberSize-1; ++i) {
            for(int j = i+1; j<numberSize; ++j ){
                if(nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}