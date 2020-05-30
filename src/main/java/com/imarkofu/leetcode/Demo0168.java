package com.imarkofu.leetcode;

/**
 * Excel表列名称
 *
 * @author cglong
 * @version 20200528000
 * 创建Demo0168类
 */
public class Demo0168 {

    public static void main(String[] args) {
        System.out.println(new Demo0168().convertToTitle(1));
        System.out.println(new Demo0168().convertToTitle(26));
        System.out.println(new Demo0168().convertToTitle(27));
        System.out.println(new Demo0168().convertToTitle(28));
        System.out.println(new Demo0168().convertToTitle(52));
        System.out.println(new Demo0168().convertToTitle(701));
    }

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            n --;
            sb.append((char)('A' + (n % 26)));
            n /= 26;
        }
        return  sb.reverse().toString();
    }
}
