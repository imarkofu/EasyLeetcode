package com.imarkofu.leetcode.y2020.w32;

public class Demo0443 {

    public static void main(String[] args) {
        System.out.println(new Demo0443().compress(new char[]{'a'}));
        System.out.println(new Demo0443().compress(new char[]{'a','a'}));
        System.out.println(new Demo0443().compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(new Demo0443().compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }

    public int compress(char[] chars) {
        int p = 0;
        int s = 0;
        int i = 1;
        for (; i < chars.length; i++) {
            if (chars[s] != chars[i]) {
                p = record(chars, p, s, i);
                s = i;
            }
        }
        return record(chars, p, s, i);
    }

    private int record(char[] chars, int p, int s, int i) {
        int t = i - s;
        chars[p ++] = chars[s];
        if (t >= 1000) {
            chars[p ++] = (char) ('0' + (t / 1000));
            t %= 1000;
            chars[p ++] = (char) ('0' + (t / 100));
            t %= 100;
            chars[p ++] = (char) ('0' + (t / 10));
            chars[p ++] = (char) ('0' + (t % 10));
        } else if (t >= 100) {
            chars[p ++] = (char) ('0' + (t / 100));
            t %= 100;
            chars[p ++] = (char) ('0' + (t / 10));
            chars[p ++] = (char) ('0' + (t % 10));
        } else if (t >= 10) {
            chars[p ++] = (char) ('0' + (t / 10));
            chars[p ++] = (char) ('0' + (t % 10));
        } else if (t > 1) {
            chars[p ++] = (char) ('0' + t);
        }
        return p;
    }
}
