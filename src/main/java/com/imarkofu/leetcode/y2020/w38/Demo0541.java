package com.imarkofu.leetcode.y2020.w38;

public class Demo0541 {

    public static void main(String[] args) {
        System.out.println(new Demo0541().reverseStr("abcdefg", 2));
    }

    public String reverseStr(String s, int k) {
        if (null == s || s.length() <= 1 || k <= 1) return s;
        char[] chs = s.toCharArray();
        int end = chs.length - 1;
        for (int i = 0, j = Math.min(2 * k - 1, end); i < chs.length; i = j + 1, j = Math.min(j + 2 * k, end)) {
            revert(chs, i, Math.min(i + k - 1, j));
        }
        return new String(chs);
    }

    private void revert(char[] chs, int start, int end) {
        char ch;
        while (start < end) {
            ch = chs[start];
            chs[start++] = chs[end];
            chs[end--] = ch;
        }
    }
}
