package com.geek.algorithm.light.Algorithm.solution;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    List<String> result;
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        recurtion(0, 0, n, "");
        return result;
    }

    private void recurtion(int left, int right, int n, String temp) {
        if (left == n && right == n) {
            result.add(temp);
            return;
        }
        if (left < n) {
            recurtion(left+1, right, n, temp+"(");
        }
        if (left > right) {
            recurtion(left, right+1, n, temp+")");
        }
    }
}
