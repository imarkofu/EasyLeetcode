package com.imarkofu.leetcode.y2020.w30;

public class Demo0389 {

    public static void main(String[] args) {
        System.out.println(new Demo0389().findTheDifference("abcd", "abcde"));
    }

    public char findTheDifference(String s, String t) {
        char tmp = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            tmp ^= s.charAt(i);
            tmp ^= t.charAt(i);
        }
        tmp ^= t.charAt(len);
        return tmp;
    }
}
