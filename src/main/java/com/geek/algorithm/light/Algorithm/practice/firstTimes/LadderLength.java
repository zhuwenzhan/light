package com.geek.algorithm.light.Algorithm.practice.firstTimes;

import java.util.ArrayList;
import java.util.List;

public class LadderLength {
    List<String> map;
    List<String> result;
    List<String> route;
    boolean[] flag;
    String firstWord;
    String endWord;

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       map = wordList;
       result = new ArrayList<>();
       route = new ArrayList<>();
       flag = new boolean[wordList.size()];
       firstWord = beginWord;
       this.endWord = endWord;
       recursion(firstWord);
       int diff = 0;
       int len = beginWord.length();
        for (int i = 0; i < len; i++) {
            if (beginWord.charAt(i) != endWord.charAt(i)) {
                diff++;
            }
        }
        if (result.size() == 0) {
            return 0;
        }
        return Math.min(diff, result.size()-1);
    }

    private boolean recursion(String beginWord) {
        List<String> neighbor = near(beginWord);
        if (!neighbor.isEmpty()) {
            for (int i = 0; i < neighbor.size(); i++) {
                String temp = neighbor.get(i);
                route.add(temp);
                if (temp.equals(endWord)) {
                    result.add(firstWord);
                    for (String s : route) {
                        result.add(s);
                    }
                    return true;
                }
                if (recursion(temp)) {
                    return true;
                }else {
                    route.remove(i);
                }
            }
        }
        return false;
    }

    private List<String> near(String beginWord){
        List<String> res = new ArrayList<>();
        int len = map.size();
        for (int i = 0; i < len; i++) {
            String temp = map.get(i);
            if (temp.length() != len || flag[i]) {
                continue;
            }
            int diff = 0;
            for (int j = 0; j < len; j++) {
                if (beginWord.charAt(j) != temp.charAt(j)) {
                    diff++;
                }
                if (diff == 2) {
                    break;
                }
            }
            if (diff == 1) {
                res.add(temp);
                flag[i] = true;
            }
        }
        return res;
    }
}
