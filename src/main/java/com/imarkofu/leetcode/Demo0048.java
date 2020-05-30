package com.imarkofu.leetcode;

import java.util.Arrays;

/**
 * 旋转图像
 *
 * @author cglong
 * @version 20200529000
 * 创建Demo0048类
 */
public class Demo0048 {

    public static void main(String[] args) {
        int[][] tp = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        new Demo0048().rotate(tp);
        for (int[] ints : tp) {
            System.out.println(Arrays.toString(ints));
        }
        tp = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        new Demo0048().rotate(tp);
        for (int[] ints : tp) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length, middle = n / 2, end, end2, tmp;
        for (int i = 0; i < middle; i++) {
            end = n - i - 1;
            for (int j = i; j < end; j++) {
                end2 = n - j - 1;
                tmp = matrix[i][j];
                matrix[i][j] = matrix[end2][i];
                matrix[end2][i] = matrix[end][end2];
                matrix[end][end2] = matrix[j][end];
                matrix[j][end] = tmp;
            }
        }
    }
}
