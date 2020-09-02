package com.imarkofu.leetcode.y2020.w35;

import java.util.Arrays;

public class Demo0080 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(new Demo0080().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
        nums = new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(new Demo0080().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int p = 1;
        boolean repeat = nums[0] == nums[1];
        for (int i = 2; i < nums.length; i++)
            if (nums[i] != nums[p]) {
                nums[++ p] = nums[i];
                repeat = false;
            } else if (!repeat) {
                nums[++ p] = nums[i];
                repeat = true;
            }
        return p + 1;
    }
}
