package com.imarkofu.leetcode.y2020.w23;

import java.util.Arrays;

public class Demo0204 {

    public static void main(String[] args) {
        System.out.println(new Demo0204().countPrimes(10));
        System.out.println(new Demo0204().countPrimes(12));
        System.out.println(new Demo0204().countPrimes(10000));

    }

    public int countPrimes(int n) {
        boolean[] tp = new boolean[n];
        Arrays.fill(tp, true);
        for (int i = 2; i < n; i++) {
            if (tp[i]) {
                for (int j = 2 * i; j < n; j+=i) {
                    tp[j] = false;
                }
            }
        }

        int total = 0;
        for (int i = 2; i < n; i++) {
            if (tp[i]) {
                total ++;
            }
        }

        return total;
    }
}