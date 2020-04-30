package com.imarkofu.leetcode;

/**
 * 两数相除
 *
 * @author cglong
 * @version 20200427000
 * 创建Demo0029类
 */
public class Demo0029 {

    public static void main(String[] args) {
        System.out.println(new Demo0029().divide(10, 3));
        System.out.println(new Demo0029().divide(7, -3));
        System.out.println(new Demo0029().divide(12, 3));
        System.out.println(Integer.MAX_VALUE);
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        long result = 0;
        long d1 = dividend >= 0 ? dividend : -((long) dividend);
        long d2 = divisor >= 0 ? divisor : -((long) divisor);
        while (d1 >= d2) {
            long tmp = d2;
            long tmpResult = 1;
            while (d1 >= tmp) {
                result += tmpResult;
                d1 -= tmp;
                tmpResult <<= 1;
                tmp <<= 1;
            }
        }
        if (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0) {
            result = -result;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }
        return (int) result;
    }
}
