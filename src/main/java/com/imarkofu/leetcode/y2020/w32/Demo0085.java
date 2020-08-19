package com.imarkofu.leetcode.y2020.w32;

public class Demo0085 {

    public static void main(String[] args) {
        System.out.println(new Demo0085().maximalRectangle(new char[][]{
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        }));
    }

    public int maximalRectangle(char[][] matrix) {
        if (null == matrix || matrix.length <= 0 || matrix[0].length <= 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        int width;
        int area = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = j == 0 ? 1 : dp[i][j - 1] + 1;
                    width = dp[i][j];
                    for (int k = i; k >= 0; k--) {
                        width = Math.min(width, dp[k][j]);
                        area = Math.max(area, width * (i - k + 1));
                    }
                }
            }
        }

        return area;
    }
}
