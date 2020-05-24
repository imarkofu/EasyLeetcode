package com.imarkofu.leetcode;

public class Demo0043 {

    public static void main(String[] args) {
        System.out.println(new Demo0043().multiply("2", "3"));
        System.out.println(new Demo0043().multiply("123", "456"));
        System.out.println(new Demo0043().multiply("1024", "1024"));
    }

    public String multiply(String num1, String num2) {
        if (null == num1 || "".equals(num1) || null == num2 || "".equals(num2)) {
            return "";
        } else if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();
        int[] rs = new int[ch1.length + ch2.length];
        int position, cur;
        for (int i = ch1.length - 1, cursor = 0; i >= 0; i--, cursor ++) {
            if (ch1[i] == '0') {
                continue;
            }
            position = cursor;
            cur = ch1[i] - '0';
            for (int j = ch2.length - 1; j >= 0; j--) {
                rs[position ++] += (ch2[j] - '0') * cur;
            }
        }

        for (int i = 0; i < rs.length - 2; i++) {
            rs[i + 1] += (rs[i] / 10);
            rs[i] = rs[i] % 10;
        }

        boolean start = false;
        StringBuilder sb = new StringBuilder(rs.length);
        for (int i = rs.length - 1; i >= 0; i--) {
            if (rs[i] == 0) {
                if (start) {
                    sb.append(0);
                }
            } else {
                start = true;
                sb.append(rs[i]);
            }
        }

        return sb.toString();
    }

}
