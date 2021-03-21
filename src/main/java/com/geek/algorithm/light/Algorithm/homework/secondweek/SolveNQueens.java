package com.geek.algorithm.light.Algorithm.homework.secondweek;

import java.util.*;

public class SolveNQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        int row = 0;
        Set<Integer> columns = new HashSet<Integer>();
        Set<Integer> diagonals1 = new HashSet<Integer>();
        Set<Integer> diagonals2 = new HashSet<Integer>();
        recurtions(results, queens, n, row, columns, diagonals1, diagonals2);
        return results;
    }

    private void recurtions(List<List<String>> results, int[] queens, int n, int row, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2){
        if(row == n){
            results.add(generatorResult(queens));
            return;
        }
        for(int i = 0; i < n; i++) {
            if(columns.contains(i)){
                continue;
            }
            int diagonal1 = row - i;
            if(diagonals1.contains(diagonal1)){
                continue;
            }
            int diagonal2 = row + i;
            if(diagonals2.contains(diagonal2)){
                continue;
            }
            queens[row] = i;
            columns.add(i);
            diagonals1.add(diagonal1);
            diagonals2.add(diagonal2);
            recurtions(results, queens, n, row + 1, columns, diagonals1, diagonals2);
            queens[row] = -1;
            columns.remove(i);
            diagonals1.remove(diagonal1);
            diagonals2.remove(diagonal2);
        }
    }

    private List<String> generatorResult(int [] queens) {
        List<String> result = new ArrayList<String>();
        for(int queen : queens){
            char[] temp = new char[queens.length];
            Arrays.fill(temp,'.');
            temp[queen] = 'Q';
            result.add(new String(temp));
        }
        return result;
    }


}
