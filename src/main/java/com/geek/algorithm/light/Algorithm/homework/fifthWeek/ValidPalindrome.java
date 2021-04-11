package com.geek.algorithm.light.Algorithm.homework.fifthWeek;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        char[] words = s.toCharArray();
        int len = words.length;
        int head  = 0;
        int tail = len-1;
        while (head < tail) {
            if (words[head] == words[tail]) {
                head++;
                tail--;
            } else {
                return validate(words, head+1, tail) || validate(words, head, tail-1);
            }
        }

        return true;
    }

    private boolean validate(char[] c, int low, int high) {
        while (low < high) {
            if (c[low] == c[high]) {
                low++;
                high--;
            } else {
                return false;
            }
        }
        return true;
    }
}
