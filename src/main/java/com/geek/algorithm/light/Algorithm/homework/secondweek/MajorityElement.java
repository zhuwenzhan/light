package com.geek.algorithm.light.Algorithm.homework.secondweek;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     *
     * @param nums
     * @return
     */
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }

    public int majorityElement(int[] nums){
        int length = nums.length;
        Map<Integer, Integer> temp = new HashMap<>();
        for(int i = 0; i < length; ++i){
            int count = temp.getOrDefault(nums[i], 0) + 1;
            if(count > length/2) return nums[i];
            temp.put(nums[i], count);
        }
        return -1;
    }


}
