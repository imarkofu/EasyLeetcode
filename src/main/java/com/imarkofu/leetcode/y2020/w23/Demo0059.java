package com.imarkofu.leetcode.y2020.w23;

import java.util.Arrays;

public class Demo0059 {

    public static void main(String[] args) {
        print(new Demo0059().generateMatrix(3));
        print(new Demo0059().generateMatrix(2));
        print(new Demo0059().generateMatrix(1));
        print(new Demo0059().generateMatrix(4));
        print(new Demo0059().generateMatrix(5));
        print(new Demo0059().generateMatrix(6));
    }
    private static void print(int[][] nn) {
        for (int[] ints : nn) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("===========================");
    }

    public int[][] generateMatrix(int n) {
        int[][] nn = new int[n][n];
        int a = 0, b = n - 1, c = n - 1, d = 0;
        int s = 1, end = n * n;
        while (s <= end) {
            for (int i = a; i <= b; i++) nn[a][i] = s ++;
            a ++;
            for (int i = a; i <= c; i++) nn[i][b] = s ++;
            b --;
            for (int i = b; i >= d; i--) nn[c][i] = s ++;
            c --;
            for (int i = c; i >= a; i--) nn[i][d] = s ++;
            d ++;
        }
        return nn;
    }
}
