package com.geek.algorithm.light.Algorithm.practice;

import java.util.*;

/**
 * 2021-04-13 22:59
 * 初看没有思路 理解起来不难 希望下次能直接想到
 */
public class solveNQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        Set<Integer> columns = new HashSet<>();
        Set<Integer> diagnols1 = new HashSet<>();
        Set<Integer> diagnols2 = new HashSet<>();
        recursion(result, queens, n, 0, columns, diagnols1, diagnols2);
        return result;
    }

    private void recursion(List<List<String>> result, int[] queens, int n, int row, Set<Integer> columns, Set<Integer> diagnols1, Set<Integer> diagnols2){
        //terminate
        if (row == n) {
            result.add(generator(queens));
            return;
        }
        //process logic in current level
        for (int i = 0; i < n; i++) {
            if (columns.contains(i)) {
                continue;
            }

            int diagnol1 = row -i;
            if (diagnols1.contains(diagnol1)) {
                continue;
            }
            int diagnol2 = row + i;
            if (diagnols2.contains(diagnol2)) {
                continue;
            }
            columns.add(i);
            diagnols1.add(diagnol1);
            diagnols2.add(diagnol2);
            queens[row] = i;
            recursion(result, queens, n, row + 1, columns, diagnols1, diagnols2);
            queens[i] = -1;
            columns.remove(i);
            diagnols1.remove(diagnol1);
            diagnols2.remove(diagnol2);

        }
        //drill down

        //revert the current level status if need
    }

    private List<String> generator(int[] queens) {
        int len = queens.length;
        List<String> res = new ArrayList<>();//这里为什么不用LinkedList
        char[] temp = new char[len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(temp, '.');
            temp[queens[i]] = 'Q'; //单引号和双引号的区别
            res.add(new String(temp)); //Arrays.toString()和直接toString什么区别 和new String(temp)什么区别
        }
        return res;
    }



    //分治
    private void devide(){
        //recursion terminator

        //prepare data

        //conquer subproblems

        //process and generate the final result

        //revert the current level states
    }


}
