package com.imarkofu.leetcode;

/**
 * 阶乘后的零
 *
 * @author cglong
 * @version 20200528000
 * 创建Demo0172类
 */
public class Demo0172 {

    public static void main(String[] args) {
        System.out.println(new Demo0172().trailingZeroes(5));
        System.out.println(new Demo0172().trailingZeroes(25));
    }

    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            n = n / 5;
            count += n;
        }
        return count;
    }
}
