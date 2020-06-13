package com.imarkofu.leetcode;

/**
 * 跳跃游戏
 *
 * @author cglong
 * @version 20200612000
 * 创建Demo0055类
 */
public class Demo0055 {

    public static void main(String[] args) {
        System.out.println(new Demo0055().canJump(new int[]{2,3,1,1,4}));
        System.out.println(new Demo0055().canJump(new int[]{3,2,1,0,4}));
        System.out.println(new Demo0055().canJump(new int[]{0,3,2,1,0,4}));
    }

    public boolean canJump(int[] nums) {
        int len = nums.length - 1;
        int mp = 0, end = 0;
        for (int i = 0; i < len; i++) {
            mp = Math.max(mp, i + nums[i]);
            if (mp >= len) {
                break;
            }
            if (i == end) {
                if (mp == i) {
                    return false;
                }
                end = mp;
            }
        }
        return true;
    }
}
