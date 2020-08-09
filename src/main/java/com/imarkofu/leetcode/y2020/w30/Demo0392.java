package com.imarkofu.leetcode.y2020.w30;

public class Demo0392 {

    public static void main(String[] args) {
        System.out.println(new Demo0392().isSubsequence("abc", "ahbgdc"));
        System.out.println(new Demo0392().isSubsequence("axc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        int sl = s.length(), tl = t.length();
        int si = 0;
        for (int ti = 0; si < sl && ti < tl; ti ++) {
            if (s.charAt(si) == t.charAt(ti)) {
                si ++;
            }
        }
        return si == sl;
    }
}
