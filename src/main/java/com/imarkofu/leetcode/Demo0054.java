package com.imarkofu.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 螺旋矩阵
 *
 * @author cglong
 * @version 20200607000
 * 创建Demo0054类
 */
public class Demo0054 {

    public static void main(String[] args) {
        System.out.println(new Demo0054().spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(new Demo0054().spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Collections.emptyList();
        }
        int length = matrix.length * matrix[0].length;
        List<Integer> list = new ArrayList<>(length);
        int a = matrix[0].length - 1, b = matrix.length - 1, c = 0, d = 0;
        while (length != list.size()) {
            // 遍历左到右行
            for (int i = c; i <= a; i++) {
                list.add(matrix[d][i]);
            }
            if (length == list.size()) {
                break;
            }
            d ++;
            // 遍历上到下列
            for (int i = d; i <= b; i++) {
                list.add(matrix[i][a]);
            }
            if (length == list.size()) {
                break;
            }
            a --;
            // 遍历右到左行
            for (int i = a; i >= c; i--) {
                list.add(matrix[b][i]);
            }
            if (length == list.size()) {
                break;
            }
            b --;
            // 遍历上到下列
            for (int i = b; i >= d; i--) {
                list.add(matrix[i][c]);
            }
            c ++;

        }

        return list;
    }
}
