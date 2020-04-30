package com.imarkofu.leetcode;

/**
 * 外观数列
 *
 * @author cglong
 * @version 20200427000
 * 创建Demo0038类
 */
public class Demo0038 {

    public static void main(String[] args) {
        System.out.println(new Demo0038().countAndSay(1));
        System.out.println(new Demo0038().countAndSay(2));
        System.out.println(new Demo0038().countAndSay(3));
        System.out.println(new Demo0038().countAndSay(4));
        System.out.println(new Demo0038().countAndSay(5));
    }

    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        } else {
            return countAndSay("1".toCharArray(), n);
        }
    }
    private String countAndSay(char[] ch, int n) {
        if (n == 1) {
            return new String(ch);
        } else {
            int start = 0, end = 1;
            StringBuilder sb = new StringBuilder();
            while (end < ch.length) {
                if (ch[start] != ch[end]) {
                    sb.append(end - start).append(ch[start]);
                    start = end;
                }
                end ++;
            }
            sb.append(end - start).append(ch[start]);
            return countAndSay(sb.toString().toCharArray(), n - 1);
        }
    }

}
