package com.imarkofu.leetcode.y2020.w37;

public class Demo0115 {

    public static void main(String[] args) {
        System.out.println(new Demo0115().numDistinct("", ""));
        System.out.println(new Demo0115().numDistinct("", "1"));
        System.out.println(new Demo0115().numDistinct("rabbbit", "rabbit"));
        System.out.println(new Demo0115().numDistinct("babgbag", "bag"));
    }

    public int numDistinct(String s, String t) {
        int row = t.length() + 1, col = s.length() + 1;
        int[][] dp = new int[row][col];
        for (int i = 0; i < col; i++)
            dp[0][i] = 1;
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (s.charAt(j - 1) == t.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[t.length()][s.length()];
    }
}
