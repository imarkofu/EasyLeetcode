package com.imarkofu.leetcode;

/**
 * 最大子序和
 *
 * @author cglong
 * @version 20200428000
 * 创建Demo0053类
 */
public class Demo0053 {

    public static void main(String[] args) {
        System.out.println(new Demo0053().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(new Demo0053().maxSubArray(new int[]{-1,-2}));
    }

    public int maxSubArray(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        } else {
            int max = nums[nums.length - 1], tmp;
            for (int i = nums.length - 2; i >= 0; i--) {
                tmp = nums[i] + nums[i + 1];
                if (nums[i] < tmp) {
                    nums[i] = tmp;
                }
                max = Math.max(max, tmp);
            }
            return max;
        }
    }
}
