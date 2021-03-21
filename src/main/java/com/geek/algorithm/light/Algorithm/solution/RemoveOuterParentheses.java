package com.geek.algorithm.light.Algorithm.solution;


/**
 * 删除最外层括号
 */
public class RemoveOuterParentheses {

    public String removeOuterParentheses (String S){
        StringBuilder result = new StringBuilder();
        int status = 0;
        for(int i = 0; i < S.length(); ++i){
            if(S.charAt(i) == ')')
                status = status - 1;
            if(S.charAt(i) > 0)
                result.append(S.charAt(i));
            if(S.charAt(i) == '(')
                status = status + 1;
        }
        return result.toString();
    }
}
