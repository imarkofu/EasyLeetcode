package com.imarkofu.leetcode.y2020.w25;

public class Demo0263 {

    public static void main(String[] args) {
        System.out.println(new Demo0263().isUgly(6));
        System.out.println(new Demo0263().isUgly(8));
        System.out.println(new Demo0263().isUgly(14));
    }

    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }
        while (0 == (num & 1)) {
            num >>= 1;
        }
        while (0 == num % 3) {
            num /= 3;
        }
        while (0 == num % 5) {
            num /= 5;
        }
        return 1 == num;
    }
}
