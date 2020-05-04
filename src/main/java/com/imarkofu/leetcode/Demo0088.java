package com.imarkofu.leetcode;

import java.util.Arrays;

public class Demo0088 {

    public static void main(String[] args) {
        int[] p = new int[]{1,2,3,0,0,0};
        new Demo0088().merge(p, 3, new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(p));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m <= 0) {
            // 直接拷贝nums2
            if (n > 0) {
                System.arraycopy(nums2, 0, nums1, 0, n);
            }
        } else if (n > 0) {
            // 合并
            int me = m - 1, ne = n - 1, p = m + n - 1;
            while (me >= 0 && ne >= 0) {
                if (nums1[me] < nums2[ne]) {
                    nums1[p --] = nums2[ne --];
                } else {
                    nums1[p --] = nums1[me --];
                }
            }
            if (ne >= 0) {
                System.arraycopy(nums2, 0, nums1, 0, ne + 1);
            }
        }
    }
}
