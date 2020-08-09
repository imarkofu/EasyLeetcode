package com.imarkofu.leetcode.y2020.w30;

public class Demo0405 {

    public static void main(String[] args) {
        System.out.println(new Demo0405().toHex(-1));
        System.out.println(new Demo0405().toHex(26));
        System.out.println(new Demo0405().toHex(0));
    }

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        } else {
            char[] chs = new char[8];
            char[] source = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
            int start = 7;
            while (num != 0) {
                chs[start --] = source[num & 0x0f];
                num = num >>> 4;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = start + 1; i < chs.length; i++) {
                sb.append(chs[i]);
            }

            return sb.toString();
        }
    }
}
