package com.imarkofu.leetcode.y2020.w30;

import java.util.Arrays;

public class Demo0073 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        System.out.println("===================");
        new Demo0073().setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
        matrix = new int[][]{{1,0,1},{0,0,0},{1,0,1}};
        System.out.println("===================");
        new Demo0073().setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
        matrix = new int[][]{{0, 1,1,0},{1,1,1,1},{1,1,1,1}};
        System.out.println("===================");
        new Demo0073().setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public void setZeroes(int[][] matrix) {
        int col = matrix[0].length;
        boolean[] cols = new boolean[col];
        boolean zero;
        for (int i = 0; i < matrix.length; i++) {
            zero = false;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    zero = true;
                    cols[j] = true;
                }
            }
            if (zero) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < col; i++) {
            if (cols[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
