package com.imarkofu.leetcode.y2020.w36;

public class Demo0504 {

    public static void main(String[] args) {
        System.out.println(new Demo0504().convertToBase7(0));
        System.out.println(new Demo0504().convertToBase7(100));
        System.out.println(new Demo0504().convertToBase7(-100));
        System.out.println(new Demo0504().convertToBase7(-7));
    }

    public String convertToBase7(int num) {
        if (0 == num) return "0";
        boolean z = true;
        if (num < 0) {
            num = - num;
            z = false;
        }
        char[] chs = new char[10];
        int start = 9;
        while (num != 0) {
            chs[start--] = (char) ((num % 7) + '0');
            num /= 7;
        }
        if (!z) chs[start --] = '-';
        return new String(chs, start + 1, 9 - start);
    }
}
