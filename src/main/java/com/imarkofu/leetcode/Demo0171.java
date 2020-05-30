package com.imarkofu.leetcode;

/**
 * Excel表列序号
 *
 * @author cglong
 * @version 20200528000
 * 创建Demo0171类
 */
public class Demo0171 {

    public static void main(String[] args) {
        System.out.println(new Demo0171().titleToNumber("A"));
        System.out.println(new Demo0171().titleToNumber("B"));
        System.out.println(new Demo0171().titleToNumber("C"));
        System.out.println(new Demo0171().titleToNumber("Z"));
        System.out.println(new Demo0171().titleToNumber("AA"));
        System.out.println(new Demo0171().titleToNumber("AB"));
        System.out.println(new Demo0171().titleToNumber("ZY"));
    }

    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + s.charAt(i) - '@';
        }
        return result;
    }
}
