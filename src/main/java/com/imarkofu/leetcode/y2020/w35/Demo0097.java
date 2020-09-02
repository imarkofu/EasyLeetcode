package com.imarkofu.leetcode.y2020.w35;

public class Demo0097 {

    public static void main(String[] args) {
        System.out.println(new Demo0097().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        System.out.println(new Demo0097().isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        boolean[][] check = new boolean[s1.length() + 1][s2.length() + 1];
        int k;
        check[0][0] = true;
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                k = i + j - 1;
                if (i > 0) {
                    check[i][j] = check[i - 1][j] && s1.charAt(i - 1) == s3.charAt(k);
                }
                if (j > 0) {
                    check[i][j] = check[i][j] || check[i][j -1] && s2.charAt(j - 1) == s3.charAt(k);
                }
            }
        }
        return check[s1.length()][s2.length()];
    }
    public boolean isInterleave2(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        return isInterleave(s1, s2, s3, 0, 0, 0);
    }

    public boolean isInterleave(String s1, String s2, String s3, int p1, int p2, int p3) {
        if (s3.length() == p3) return true;
        if (s1.length() != p1 && s1.charAt(p1) == s3.charAt(p3))
            if (isInterleave(s1, s2, s3, p1 + 1, p2, p3 + 1))
                return true;
        if (s2.length() != p2 && s2.charAt(p2) == s3.charAt(p3))
            return isInterleave(s1, s2, s3, p1, p2 + 1, p3 + 1);
        return false;
    }
}
