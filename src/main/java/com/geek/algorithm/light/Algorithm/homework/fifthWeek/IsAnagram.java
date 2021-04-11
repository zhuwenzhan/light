package com.geek.algorithm.light.Algorithm.homework.fifthWeek;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() != t.length()) {
           return false;
        }
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
