package com.imarkofu.leetcode.y2020.w25;

public class Demo0064 {

    public static void main(String[] args) {
        System.out.println(new Demo0064().minPathSum(new int[][]{ {1,3,1},{1,5,1},{4,2,1}}));
    }

    public int minPathSum(int[][] grid) {
        int w = grid[0].length - 1;
        int h = grid.length - 1;
        for (int i = w - 1; i >= 0; i--) {
            grid[h][i] += grid[h][i + 1];
        }
        for (int i = h - 1; i >= 0; i--) {
            grid[i][w] += grid[i + 1][w];
        }
        w  --;
        for (int i = grid.length - 2; i >= 0; i--) {
            for (int j = w; j >= 0; j--) {
                grid[i][j] = grid[i][j] + Math.min(grid[i+1][j], grid[i][j+1]);
            }
        }
        return grid[0][0];
    }
}
