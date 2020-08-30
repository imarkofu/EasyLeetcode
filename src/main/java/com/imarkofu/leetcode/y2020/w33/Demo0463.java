package com.imarkofu.leetcode.y2020.w33;

public class Demo0463 {

    public static void main(String[] args) {
        System.out.println(new Demo0463().islandPerimeter(new int[][]{
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}}));
    }

    public int islandPerimeter(int[][] grid) {
        int rs = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    rs += 4;
                    if (i > 0 && grid[i - 1][j] == 1) rs -= 2;
                    if (j > 0 && grid[i][j - 1] == 1) rs -= 2;
                }
            }
        }
        return rs;
    }

}
