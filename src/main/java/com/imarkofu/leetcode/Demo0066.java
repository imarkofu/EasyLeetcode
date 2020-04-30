package com.imarkofu.leetcode;

import java.util.Arrays;

public class Demo0066 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Demo0066().plusOne(new int[]{0})));
        System.out.println(Arrays.toString(new Demo0066().plusOne(new int[]{9, 9})));
        System.out.println(Arrays.toString(new Demo0066().plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(new Demo0066().plusOne(new int[]{1, 2, 3})));
    }

    public int[] plusOne(int[] digits) {
        if (null == digits || digits.length == 0) {
            return digits;
        } else {
            int start = digits.length - 1;
            for (int i = start; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i]++;
                    for (int j = start; j > i; j--) {
                        digits[j] = 0;
                    }
                    return digits;
                }
            }
            int[] n = new int[digits.length + 1];
            n[0] = 1;
            return n;
        }
    }
}
