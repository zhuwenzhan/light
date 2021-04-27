package com.geek.algorithm.light.Algorithm.practice.firstTimes;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public List<List<Integer>> combinationSum1(int[] nums, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int idx = 0;
        dfs(nums, target, temp, res, idx);
        return res;
    }

    private void dfs(int[] nums, int target, List<Integer> temp, List<List<Integer>> res, int idx){
        if (idx == nums.length) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        dfs(nums, target, temp, res, idx+1);
        if (target - nums[idx] >= 0) {
            temp.add(nums[idx]);
            dfs(nums, target - nums[idx], temp, res, idx);
            temp.remove(temp.size() - 1);
        }


    }
}
