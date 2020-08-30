package com.imarkofu.leetcode.y2020.w33;

public class Demo0461 {

    public static void main(String[] args) {
        System.out.println(new Demo0461().hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        // return Integer.bitCount(x ^ y);
        int r = x ^ y;
        int c = 0;
        // 不等于0，说明存在二进制位为1的位，r & (r - 1) 消除最后一个二进制位1
        while (r != 0) {
            c ++;
            r = r & (r - 1);
        }
        return c;
    }
}
