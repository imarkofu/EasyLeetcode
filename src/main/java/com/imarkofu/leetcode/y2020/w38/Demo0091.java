package com.imarkofu.leetcode.y2020.w38;

public class Demo0091 {

    public static void main(String[] args) {
        System.out.println(new Demo0091().numDecodings("12"));
        System.out.println(new Demo0091().numDecodings("226"));
        System.out.println(new Demo0091().numDecodings("2260"));
    }

    public int numDecodings(String s) {
        if (null == s || s.isEmpty()) return 0;
        int[] dp = new int[s.length()];
        int i = s.length() - 1, n2;
        dp[i] = s.charAt(i) == '0' ? 0 : 1;
        char cur, next;
        for (i --; i >= 0; i--) {
            cur = s.charAt(i);
            if (cur == '0') {
                dp[i] = 0;
            } else if (cur >= '3') {
                dp[i] = dp[i + 1];
            } else {
                next = s.charAt(i + 1);
                n2 = i + 2 == s.length() ? 1 : dp[i + 2];
                if (next == '0') {
                    dp[i] = n2;
                } else if (cur == '1' || next <= '6') {
                    dp[i] = dp[i + 1] + n2;
                } else {
                    dp[i] = dp[i + 1];
                }
            }
        }
        return dp[0];
    }
    public int numDecodings2(String s) {
        if (null == s || s.isEmpty()) return 0;
        return todo(s.toCharArray(), 0, s.length() - 1);
    }

    private int todo(char[] chs, int p, int end) {
        // 需要反向，不然dp没缓存，缺少动态规划的意义
        if (p > end) {
            return 1;
        } else if (p == end) {
            return chs[p] == '0' ? 0 : 1;
        } else {
            if (chs[p] == '0') {
                return 0;
            } else if (chs[p + 1] == '0') {
                return (chs[p] == '1' || chs[p] == '2') ? todo(chs, p + 2, end) : 0;
            } else if (chs[p] < '2' || (chs[p] == '2' && chs[p + 1] <= '6')) {
                return todo(chs, p + 1, end) + todo(chs, p + 2, end);
            } else {
                return todo(chs, p + 1, end);
            }
        }
    }
}
