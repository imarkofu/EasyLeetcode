package com.imarkofu.leetcode.y2020.w35;

import java.util.Arrays;

public class Demo0482 {

    public static void main(String[] args) {
        System.out.println(new Demo0482().licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(new Demo0482().licenseKeyFormatting("2-5g-3-J", 2));
        System.out.println(new Demo0482().licenseKeyFormatting("2-5g-3-J-4", 2));
        System.out.println(new Demo0482().licenseKeyFormatting("2-5g-3-J-4", 2));
        System.out.println(new Demo0482().licenseKeyFormatting("---", 2));
    }

    public String licenseKeyFormatting(String S, int K) {
        char[] chs = S.toCharArray();
        int start = 0;
        // 数据格式化
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] >= 'a') {
                chs[start ++] = (char) (chs[i] - 32);
            } else if (chs[i] != '-') {
                chs[start ++] = chs[i];
            }
        }

        // 校验空间是否足够
        int splitCount = (start > 0 && start % K == 0) ? start / K - 1 :start / K;
        if (chs.length < start + splitCount) {
            chs = Arrays.copyOf(chs, start + splitCount);
        }

        // 格式化
        int ss = start - 1, count = 0;
        for (int i = start + splitCount - 1; i >= 0 && i != ss; i--) {
            chs[i] = chs[ss --];
            if (++count % K == 0) {
                chs[--i] = '-';
            }
        }

        return new String(chs, 0, start + splitCount);
    }
}
