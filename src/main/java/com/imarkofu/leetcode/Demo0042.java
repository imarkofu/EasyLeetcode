package com.imarkofu.leetcode;

public class Demo0042 {

    public static void main(String[] args) {
        System.out.println(new Demo0042().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public int trap(int[] height) {
        int l = 0, r = height.length - 1, total = 0;
        int ml = 0, mr = 0;
        while (l < r) {
            if (height[l] > height[r]) {
                // 计算右边
                if (height[r] < mr) {
                    total += (mr - height[r]);
                } else {
                    mr = height[r];
                }
                r --;
            } else {
                // 计算左边
                if (height[l] < ml) {
                    total += (ml - height[l]);
                } else {
                    ml = height[l];
                }
                l ++;
            }
        }
        return total;
    }
}
