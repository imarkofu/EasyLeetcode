package com.imarkofu.leetcode.y2020.w38;

public class Demo0557 {

    public static void main(String[] args) {
        System.out.println(new Demo0557().reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        if (null == s || s.isEmpty() || (s = s.trim()).isEmpty()) return s;
        char[] chs = s.toCharArray();
        int start = 0;
        boolean contain = false;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] != ' ') {
                if (!contain) {
                    contain = true;
                    start = i;
                }
            } else if (contain) {
                revert(chs, start, i - 1);
                contain = false;
            }
        }
        if (contain) {
            revert(chs, start, chs.length - 1);
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
