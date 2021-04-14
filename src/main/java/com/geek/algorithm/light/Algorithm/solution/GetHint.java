package com.geek.algorithm.light.Algorithm.solution;

public class GetHint {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        int[] temp = new int[10];
        int x = 0, y = 0;
        char s,g;
        for (int i = 0; i < len; i++) {
            s = secret.charAt(i);
            g = guess.charAt(i);
            if (s == g) {
                ++x;
            } else {
                if (temp[s - '0']-- > 0) {
                    ++y;
                }
                if (temp[g - '0']++ < 0) {
                    ++y;
                }
            }
        }
        return x+"A"+y+"B";
    }
}

