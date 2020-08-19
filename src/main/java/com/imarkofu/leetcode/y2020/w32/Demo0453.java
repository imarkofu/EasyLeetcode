package com.imarkofu.leetcode.y2020.w32;

import java.util.Arrays;

public class Demo0453 {

    public static void main(String[] args) {
        System.out.println(new Demo0453().minMoves(new int[]{1,2,3}));
        System.out.println(new Demo0453().minMoves(new int[]{1,1,3}));
        System.out.println(new Demo0453().minMoves(new int[]{13,18,3,10,35,68,50,20,50}));
    }

    public int minMoves(int[] nums) {
        int count = 0, min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        for (int num : nums) {
            count += (num - min);
        }
        return count;
    }

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            count += (nums[i] - nums[0]);
        }
        return count;
    }
}
