package com.imarkofu.leetcode;

/**
 * 颠倒二进制位
 *
 * @author cglong
 * @version 20200603000
 * 创建Demo0190类
 */
public class Demo0190 {

    public static void main(String[] args) {
        System.out.println(new Demo0190().reverseBits(43261596) == 964176192);
        System.out.println("10111111111111111111111111111111".equals(Integer.toBinaryString(new Demo0190().reverseBits((int) 4294967293L))));
    }

    public int reverseBits(int n) {
        n = (n >>> 16) | (n << 16);
        n = ((n & 0xFF00FF00) >>> 8) | ((n & 0x00FF00FF) << 8);
        n = ((n & 0xF0F0F0F0) >>> 4) | ((n & 0x0F0F0F0F) << 4);
        n = ((n & 0xCCCCCCCC) >>> 2) | ((n & 0x33333333) << 2);
        n = ((n & 0xAAAAAAAA) >>> 1) | ((n & 0x55555555) << 1);
        return n;
    }

    // public int reverseBits(int n) {
    //     int tmp;
    //     for (int i = 0, j = 31; i < 16; i++, j --) {
    //         tmp = n >> i & 1;
    //         if (tmp != (n >> j & 1)) {
    //             if (tmp == 0) {
    //                 n = (n & (~(1 << j)) | (1 << i));
    //             } else {
    //                 n = (n & (~(1 << i)) | (1 << j));
    //             }
    //         }
    //     }
    //     return n;
    // }
}
