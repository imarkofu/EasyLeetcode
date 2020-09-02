package com.imarkofu.leetcode.y2020.w35;

public class Demo0476 {

    public static void main(String[] args) {
        System.out.println(new Demo0476().findComplement(1));
        System.out.println(new Demo0476().findComplement(5));
        System.out.println(new Demo0476().findComplement(Integer.MAX_VALUE));
    }

    public int findComplement(int num) {
        int n = num, count = 0;
        while (n != 0) {
            count ++;
            n >>= 1;
        }
        return num ^ ((1<<count) - 1);
    }
}
