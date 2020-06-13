package com.imarkofu.leetcode;

/**
 * 打家劫舍
 *
 * @author cglong
 * @version 20200609000
 * 创建Demo0198类
 */
public class Demo0198 {

    public static void main(String[] args) {
        System.out.println(new Demo0198().rob(new int[]{1,2,3,1}));
        System.out.println(new Demo0198().rob(new int[]{2,7,9,3,1}));
    }

    public int rob(int[] nums) {
        if (null == nums || nums.length <= 0) {
            return 0;
        } else if (1 == nums.length) {
            return nums[0];
        } else {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            }
            return dp[nums.length - 1];
        }
    }
}
