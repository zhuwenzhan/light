package com.geek.algorithm.light.Algorithm.practice.firstTimes;


public class ReplaceSpace {
    public String replaceSpace(String s) {
//        return s.replace(" ", "20%");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(s.charAt(i));
            }

        }
        return res.toString();
    }
}
