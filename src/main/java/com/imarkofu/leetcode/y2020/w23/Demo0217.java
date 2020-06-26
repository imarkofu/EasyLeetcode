package com.imarkofu.leetcode.y2020.w23;

import java.util.Arrays;

public class Demo0217 {

    public static void main(String[] args) {
        System.out.println(new Demo0217().containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(new Demo0217().containsDuplicate(new int[]{1,2,3,1}));
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int end = nums.length - 1;
        for (int i = 0; i < end; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
