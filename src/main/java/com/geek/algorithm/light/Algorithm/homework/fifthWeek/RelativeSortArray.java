package com.geek.algorithm.light.Algorithm.homework.fifthWeek;

import java.util.Arrays;

public class RelativeSortArray {
//    public int[] relativeSortArray(int[] arr1, int[] arr2) {
//
//    }


    private int[] method1(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1];
        int n = 0;
        int temp;
        Arrays.sort(arr1);
        for (int i = 0; i < len2; ++i) {
            for (int j = 0; j < len1; ++j) {
                if (arr2[i] == arr1[j]) {
                    result[n++] = arr1[j];
                }
            }
        }

        for (int i = 0; i < len1; ++i) {
            int j = 0;
            for (; j < len2; ++j) {
                if (arr1[i] == arr2[j]) {
                    break;
                }
            }
            if (j == len2) {
                result[n++] = arr1[i];
            }
        }
        return result;
    }

}
