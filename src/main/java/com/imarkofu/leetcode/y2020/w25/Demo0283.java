package com.imarkofu.leetcode.y2020.w25;

import java.util.Arrays;

public class Demo0283 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        new Demo0283().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int cursor = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != cursor) {
                    nums[cursor] = nums[i];
                }
                cursor ++;
            }
        }
        for (; cursor < nums.length; cursor++) {
            nums[cursor] = 0;
        }
    }
}
