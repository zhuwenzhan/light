package com.geek.algorithm.light.Algorithm.practice.firstTimes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<String> map;
    String ew, bw;
    List<String> result;
    List<String> fake;
    boolean[] flag;

    public int findLadders(String beginWord, String endWord, List<String> wordList) {
        ew = endWord;
        bw = beginWord;
        flag = new boolean[wordList.size()];
        int[] nums = new int[wordList.size()];
        for (int i = 0; i < wordList.size(); i++) {
            result = new ArrayList<>();
            fake = new ArrayList<>();
            map = new ArrayList<>();
            map.add(wordList.get(i));
            for (int j = 0; j < wordList.size(); j++) {
                if (i == j) {
                    continue;
                }
                map.add(wordList.get(j));
            }
            dfs(beginWord);
            nums[i] = result.size()-1;
        }
        Arrays.sort(nums);
        return nums[0];

    }

    public boolean dfs(String temp) {
        List<String> neighbhood = near(temp);
        if (!neighbhood.isEmpty()) {
            for (String tt : neighbhood) {
                fake.add(tt);
                if (tt.equals(ew)) {
                    result.add(bw);
                    for (String str : fake) {
                        result.add(str);
                    }
                    return true;
                }
                if (dfs(tt)) {
                    return true;
                } else
                    fake.remove(fake.size() - 1);
            }
        } else {
            return false;
        }
        return false;

    }

    public List<String> near(String str) {
        List<String> res = new ArrayList<>();
        int len1 = str.length();
        for (int j = 0; j < map.size(); j++) {
            String tt = map.get(j);
            if (tt.length() != len1 || flag[j])
                continue;
            int differ = 0;
            for (int i = 0; i < len1; i++) {
                if (str.charAt(i) != tt.charAt(i))
                    differ++;
                if (differ == 2)
                    break;
            }
            if (differ == 1) {
                flag[j] = true;
                res.add(tt);
            }
        }
        return res;
    }
}
