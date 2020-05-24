package com.imarkofu.leetcode;

public class Demo0136 {

    public static void main(String[] args) {
        System.out.println(new Demo0136().singleNumber(new int[]{2,2,1}));
        System.out.println(new Demo0136().singleNumber(new int[]{4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i : nums) {
            num ^= i;
        }
        return num;
    }
}
