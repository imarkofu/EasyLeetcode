package com.imarkofu.leetcode;

/**
 * 跳跃有效Ⅱ
 *
 * @author cglong
 * @version 20200607000
 * 创建Demo0045类
 */
public class Demo0045 {

    public static void main(String[] args) {
        System.out.println(new Demo0045().jump(new int[]{2,3,1,1,4}));
    }

    public int jump(int[] nums) {
        int len = nums.length - 1;
        int steps = 0;
        int end = 0;
        int mp = 0;
        for (int i = 0; i < len; i++) {
            mp = Math.max(mp, i + nums[i]);
            if (i == end) {
                end = mp;
                steps ++;
            } else if (mp >= len) {
                // 既然找个一个符合要求的，直接跳出循环
                steps ++;
                break;
            }
        }
        return steps;
    }
}
