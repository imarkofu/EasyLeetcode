package com.imarkofu.leetcode.y2020.w37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo0089 {

    public static void main(String[] args) {
        System.out.println(new Demo0089().grayCode(0));
        System.out.println(new Demo0089().grayCode(1));
        System.out.println(new Demo0089().grayCode(2));
        System.out.println(new Demo0089().grayCode(3));
        System.out.println(new Demo0089().grayCode(4));
    }

    /**
     * 关键是搞清楚格雷编码的生成过程, G(i) = i ^ (i/2);
     *     如 n = 3:
     *     G(0) = 000,
     *     G(1) = 1 ^ 0 = 001 ^ 000 = 001
     *     G(2) = 2 ^ 1 = 010 ^ 001 = 011
     *     G(3) = 3 ^ 1 = 011 ^ 001 = 010
     *     G(4) = 4 ^ 2 = 100 ^ 010 = 110
     *     G(5) = 5 ^ 2 = 101 ^ 010 = 111
     *     G(6) = 6 ^ 3 = 110 ^ 011 = 101
     *     G(7) = 7 ^ 3 = 111 ^ 011 = 100
     */
    public List<Integer> grayCode(int n) {
        if (n < 0) return Collections.emptyList();
        int count = 1 << n;
        List<Integer> result = new ArrayList<>(count);
        for (int i = 0; i < count; i++)
            result.add(i ^ (i >> 1));
        return result;
    }
}
