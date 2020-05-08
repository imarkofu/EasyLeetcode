package com.imarkofu.leetcode;

/**
 * 最长有效括号
 *
 * @author cglong
 * @version 20200508000
 * 创建Demo0032类
 */
public class Demo0032 {

    public static void main(String[] args) {
        System.out.println(new Demo0032().longestValidParentheses("(()"));
        System.out.println(new Demo0032().longestValidParentheses(")()())"));
    }

    public int longestValidParentheses(String s) {
        if (null == s || s.length() <= 1) {
            return 0;
        } else {
            int max = 0;
            int[] dp = new int[s.length()];
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == ')') {
                    if (s.charAt(i - 1) == '(') {
                        dp[i] = i >= 2 ? (dp[i - 2] + 2) : 2;
                    } else if (dp[i - 1] != 0 && i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        dp[i] = dp[i - 1] + ((i - dp[i - 1] > 1) ? dp[i - dp[i - 1] - 2] : 0) + 2;
                    }
                    max = Math.max(max, dp[i]);
                }
            }

            return max;
        }
    }
}
