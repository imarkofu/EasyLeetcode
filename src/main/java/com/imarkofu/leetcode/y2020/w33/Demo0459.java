package com.imarkofu.leetcode.y2020.w33;

import java.util.Arrays;

public class Demo0459 {

    public static void main(String[] args) {
        // System.out.println(new Demo0459().repeatedSubstringPattern("a"));
        // System.out.println(new Demo0459().repeatedSubstringPattern("aa"));
        // System.out.println(new Demo0459().repeatedSubstringPattern("abab"));
        // System.out.println(new Demo0459().repeatedSubstringPattern("aba"));
        // System.out.println(new Demo0459().repeatedSubstringPattern("abcabcabcabc"));
        System.out.println(new Demo0459().repeatedSubstringPattern("babbabbabbabbab"));
    }

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] fail = new int[n];
        Arrays.fill(fail, -1);
        for (int i = 1; i < n; ++i) {
            int j = fail[i - 1];
            while (j != -1 && s.charAt(j + 1) != s.charAt(i)) {
                j = fail[j];
            }
            if (s.charAt(j + 1) == s.charAt(i)) {
                fail[i] = j + 1;
            }
        }
        return fail[n - 1] != -1 && n % (n - fail[n - 1] - 1) == 0;
    }
    public boolean repeatedSubstringPattern2(String s) {
        if (s.length() == 1) {
            return false;
        } else {
            int ep = Math.min(s.length() / 2 + 1, s.length() - 1);
            for (int i = 1; i <= ep; i++) {
                if (s.charAt(i) == s.charAt(0)) {
                    // 按照步长为i进行判断
                    if (check(s, i + 1, i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean check(String s, int i, int step) {
        if (s.length() % step == 0) {
            for (; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i % step)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
