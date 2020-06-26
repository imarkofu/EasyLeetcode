package com.imarkofu.leetcode.y2020.w24;

public class Demo0062 {

    public static void main(String[] args) {
        System.out.println(new Demo0062().uniquePaths(3,2));
        System.out.println(new Demo0062().uniquePaths(7,3));
    }

    public int uniquePaths(int m, int n) {
        int[][] nm = new int[n][m];
        for (int i = 0; i < m; i++) {
            nm[n-1][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            nm[i][m - 1] = 1;
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                nm[j][i] = nm[j + 1][i] + nm[j][i + 1];
            }
        }
        return nm[0][0];
    }
}
