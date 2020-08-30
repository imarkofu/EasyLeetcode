package com.imarkofu.leetcode.y2020.w33;

import java.util.Arrays;

public class Demo0455 {

    public static void main(String[] args) {
        System.out.println(new Demo0455().findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
        System.out.println(new Demo0455().findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }

    public int findContentChildren(int[] g, int[] s) {
        int result = 0;
        if (null != g && null != s) {
            Arrays.sort(g);
            Arrays.sort(s);
            for (int i = 0, j = 0; i < g.length && j < s.length; i++) {
                for (; j < s.length; j++) {
                    if (g[i] <= s[j]) {
                        result++;
                        j++;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
