package com.geek.algorithm.light.Algorithm.homework.forthWeek;

public class numIslands {
    public int numIslands(char[][] grid) {
        int line = grid.length;
        int column = grid[0].length;
        int num = 0;
        for (int i = 0; i < line; ++i) {
            for (int j = 0; j < column; ++j) {
                if (grid[i][j] == 0) {
                    ++num;
                    dealLands(grid, i , j);
                }
            }
        }
        return num;
    }

    public void dealLands(char[][] grid, int i, int j) {
        grid[i][j] = 0;
        if (grid[i+1][j] == 1){
            dealLands(grid, i+1, j);
        }
        if (grid[i][j+1] == 1) {
            dealLands(grid, i, j+1);
        }
        if(i>0 && grid[i-1][j] == 1) {
            dealLands(grid, i-1, j);
        }
        if(j>0 && grid[i][j-1] == 1) {
            dealLands(grid, i, j-1);
        }
    }

}
