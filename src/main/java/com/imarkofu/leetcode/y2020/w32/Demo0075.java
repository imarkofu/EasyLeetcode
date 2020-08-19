package com.imarkofu.leetcode.y2020.w32;

import java.util.Arrays;

public class Demo0075 {

    public static void main(String[] args) {
        new Demo0075().sortColors(new int[]{2,0,2,1,1,0});
        new Demo0075().sortColors(new int[]{1,1,1,1,1,0});
    }

    public void sortColors(int[] nums) {
        int s = 0, p = nums.length - 1;
        for (int i = 0; i <= p; i++) {
            if (nums[i] == 0) {
                if (swap(nums, s ++, i)) {
                    i --;
                }
            } else if (nums[i] == 2) {
                swap(nums, p --, i --);
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    private boolean swap(int[] nums, int i, int j) {
        if (i != j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            return true;
        } else {
            return false;
        }
    }
}
