package com.imarkofu.leetcode;

/**
 * 实现strStr()
 *
 * @author cglong
 * @version 20200424000
 * 创建Demo0028类
 */
public class Demo0028 {

    public static void main(String[] args) {
        System.out.println(new Demo0028().strStr("", ""));
        System.out.println(new Demo0028().strStr("hello", "ll"));
        System.out.println(new Demo0028().strStr("aaaaa", "bba"));
        System.out.println(new Demo0028().strStr("aaaaa", "aaaaa"));
    }

    public int strStr(String haystack, String needle) {
        if (null == needle || needle.length() == 0) {
            return 0;
        } else if (null == haystack || haystack.length() == 0 || haystack.length() < needle.length()) {
            return -1;
        } else {
            byte[] h = haystack.getBytes();
            byte[] n = needle.getBytes();
            int t = h.length - n.length + 1;
            for (int i = 0; i < t; i++) {
                boolean found = true;
                for (int j = 0; j < n.length; j++) {
                    if (h[i + j] != n[j]) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i;
                }
            }
            return -1;
        }

    }
}
