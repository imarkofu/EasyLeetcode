package com.imarkofu.leetcode.y2020.w25;

public class Demo0063 {

    public static void main(String[] args) {
        int[][] mm = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(new Demo0063().uniquePathsWithObstacles(mm));
        System.out.println(new Demo0063().uniquePathsWithObstacles(new int[][]{{1}}));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int h = obstacleGrid.length - 1;
        int w = obstacleGrid[0].length - 1;
        int[][] tmp = new int[obstacleGrid.length][obstacleGrid[0].length];
        tmp[h][w] = obstacleGrid[h][w] == 1 ? 0 : 1;
        for (int i = h - 1; i >= 0; i--) {
            tmp[i][w] = obstacleGrid[i][w] == 1 ? 0 : tmp[i + 1][w];
        }
        for (int i = w - 1; i >= 0; i--) {
            tmp[h][i] = obstacleGrid[h][i] == 1 ? 0 : tmp[h][i + 1];
        }
        for (int i = h - 1; i >= 0; i--) {
            for (int j = w - 1; j >= 0; j--) {
                tmp[i][j] = obstacleGrid[i][j] == 1 ? 0 :(tmp[i + 1][j] + tmp[i][j + 1]);
            }
        }
        return tmp[0][0];
    }
}
