package com.imarkofu.leetcode;

/**
 * 通配符匹配
 *
 * @author cglong
 * @version 20200530000
 * 创建Demo0044类
 */
public class Demo0044 {

    public static void main(String[] args) {
        System.out.println(new Demo0044().isMatch("", "") == true);
        System.out.println(new Demo0044().isMatch("aa", "a") == false);
        System.out.println(new Demo0044().isMatch("aa", "*") == true);
        System.out.println(new Demo0044().isMatch("cb", "?a") == false);
        System.out.println(new Demo0044().isMatch("adceb", "*a*b") == true);
        System.out.println(new Demo0044().isMatch("acdcb", "a*c?b") == false);
        System.out.println(new Demo0044().isMatch("ho", "ho**") == true);
        System.out.println(new Demo0044().isMatch("mississippi", "m??*ss*?i*pi") == false);
    }

    public boolean isMatch(String s, String p) {
        int si = 0, pi = 0;
        int starIdx = -1, sTmpIdx = -1;
        while (si < s.length()) {
            if (pi < p.length() && (p.charAt(pi) == '?' || p.charAt(pi) == s.charAt(si))) {
                si ++;
                pi ++;
            } else if (pi < p.length() && p.charAt(pi) == '*') {
                starIdx = pi;
                sTmpIdx = si;
                pi ++;
            } else if (starIdx == -1) {
                return false;
            } else {
                pi = starIdx + 1;
                si = sTmpIdx + 1;
                sTmpIdx = si;
            }

        }

        for(int i = pi; i < p.length(); i++)
            if (p.charAt(i) != '*') return false;
        return true;
    }

    // public boolean isMatch(String s, String p) {
    //     if (p.isEmpty()) {
    //         return isMatch(s, p, 0, 0);
    //     } else {
    //         char[] chs = p.toCharArray();
    //         int cur = 1;
    //         for (int i = 1; i < chs.length; i++) {
    //             if (chs[i] != '*') {
    //                 if (cur != i) {
    //                     chs[cur] = chs[i];
    //                 }
    //                 cur ++;
    //             } else if (chs[cur - 1] != '*') {
    //                 chs[cur++] = chs[i];
    //             }
    //         }
    //         return isMatch(s, new String(chs, 0, cur), 0, 0);
    //     }
    // }
    //
    // public boolean isMatch(String s, String p, int si, int pi) {
    //     if (si == s.length()) {
    //         return pi == p.length() || (pi == p.length() - 1 && p.charAt(pi) == '*');
    //     } else if (pi == p.length()) {
    //         return false;
    //     } else {
    //         if (p.charAt(pi) == '?' || p.charAt(pi) == s.charAt(si)) {
    //             return isMatch(s, p, si + 1, pi + 1);
    //         } else if (p.charAt(pi) == '*') {
    //             for (int i = si; i <= s.length(); i++) {
    //                 if (isMatch(s, p, i, pi + 1)) {
    //                     return true;
    //                 }
    //             }
    //             return false;
    //         } else {
    //             return false;
    //         }
    //     }
    // }
}
