package com.geek.algorithm.light.Algorithm.solution;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;

public class RobotSim {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] directX = new int[]{0, 1 ,0 , -1};
        int[] directY = new int[]{1, 0, -1, 0};
        int direct = 0;
        int curX = 0;
        int curY = 0;
        int maxValue = 0;

        Set<Pair<Integer, Integer>> obstaclesSet = new HashSet<>();
        for (int n = 0; n < obstacles.length; ++n) {
            obstaclesSet.add(new Pair<>(obstacles[n][0], obstacles[n][1]));
        }

        for(int j = 0; j < commands.length; ++j) {
            if(commands[j] == -1) {
                direct = (direct + 1) % 4;
            } else if (commands[j] == -2) {
                direct = (direct + 3) % 4;
            } else {
                for(int i = 0; i < commands[j]; ++i) {
                    int nx = curX + directX[direct];
                    int ny = curY + directY[direct];
                    if(obstaclesSet.contains(new Pair<>(nx, ny))){
                        break;
                    }
                    curX = nx;
                    curY = ny;
                    maxValue = Math.max(maxValue, (curX * curX + curY * curY));
                }
            }
        }
        return maxValue;
    }
}
