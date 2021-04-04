package com.geek.algorithm.light.Algorithm.solution;

public class Search {
//    public int search(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == target)
//                return i;
//        }
//        return -1;

//        int len = nums.length;
//        int start = 0;
//        int mid = len/2;
//        while (start < mid) {
//            if (nums[start] == target) {
//                return start;
//            } else if (nums[mid] == target) {
//                return mid;
//            } else if (nums[start] == nums[mid]) {
//                ++start;
//            } else if (nums[start] < nums[mid] && target < nums[mid]) {
//                ++start;
//                mid = mid / 2;
//            } else if (nums[start] < nums[mid] && target > nums[mid]) {
//                start = mid + 1;
//                mid = mid + len / 2;
//            } else if (nums[start] > nums[mid] && target < nums[mid]) {
//                ++ start;
//                mid = start + mid / 2;
//            } else if (nums[start] > nums[mid] && target > nums[mid]) {
//                start = mid + 1;
//                mid = mid + len /2;
//            }
//        }
//    }
}
