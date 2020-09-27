package com.imarkofu.leetcode.y2020.w37;

import java.util.Arrays;

public class Demo0532 {
    public static void main(String[] args) {
        System.out.println(new Demo0532().findPairs(new int[]{3,1,4,1,5}, 1));
        System.out.println(new Demo0532().findPairs(new int[]{3,1,4,1,5}, 0));
        System.out.println(new Demo0532().findPairs(new int[]{1,1,1,2,3,4,5}, 1));
        System.out.println(new Demo0532().findPairs(new int[]{1,1,1,2,3,4,5}, 0));
        System.out.println(new Demo0532().findPairs(new int[]{1,2,3,4,5}, 1));
    }

    public int findPairs(int[] nums, int k) {
        if (null == nums || nums.length <= 1) return 0;
        Arrays.sort(nums);
        int count = 0;
        int end = nums.length - 1;
        for (int i = 0; i < end; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == k) {
                    count ++;
                    break;
                } else if (nums[j] - nums[i] > k) {
                    break;
                }
            }
        }
        return count;
    }
}
