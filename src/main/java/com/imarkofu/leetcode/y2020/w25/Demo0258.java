package com.imarkofu.leetcode.y2020.w25;

public class Demo0258 {

    public static void main(String[] args) {
        System.out.println(new Demo0258().addDigits1(38));
        System.out.println(new Demo0258().addDigits(38));
    }

    public int addDigits(int num) {
        return (num-1)%9+1;
    }

    public int addDigits1(int num) {
        if (num < 10) return num;
        int total = num % 10;
        while ((num = num / 10) > 0) {
            total += num % 10;
        }
        return addDigits1(total);
    }
}
