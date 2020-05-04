package com.imarkofu.leetcode;

public class Demo0067 {

    public static void main(String[] args) {
        System.out.println(new Demo0067().addBinary("11", "1"));
        System.out.println(new Demo0067().addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        boolean up = false;
        for (; i >= 0 && j >= 0; i --,j --) {
            if (a.charAt(i) != b.charAt(j)) {
                if (up) {
                    sb.append('0');
                    up = true;
                } else {
                    sb.append('1');
                    up = false;
                }
            } else {
                sb.append(up ? "1" : "0");
                up = a.charAt(i) == '1';
            }
        }

        up = deal(a, i, sb, up);
        up = deal(b, j, sb, up);
        if (up) {
            sb.append("1");
        }

        return sb.reverse().toString();
    }

    private boolean deal(String a, int i, StringBuilder sb, boolean up) {
        while (i >= 0) {
            if (up) {
                if (a.charAt(i) == '1') {
                    sb.append('0');
                } else {
                    sb.append('1');
                    up = false;
                }
            } else {
                sb.append(a.charAt(i));
            }
            i --;
        }
        return up;
    }
}
