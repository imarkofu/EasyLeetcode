package com.imarkofu.leetcode.y2020.w25;

public class Demo0268 {

    public static void main(String[] args) {
        System.out.println(new Demo0268().missingNumber(new int[]{0}));
        System.out.println(new Demo0268().missingNumber(new int[]{1}));
        System.out.println(new Demo0268().missingNumber(new int[]{3,0,1}));
        System.out.println(new Demo0268().missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    public int missingNumber(int[] nums) {
        boolean max = false;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums.length) {
                    max = true;
                    break;
                } else {
                    int tmp = nums[i];
                    nums[i] = nums[nums[i]];
                    nums[tmp] = tmp;
                }
            }
        }
        if (!max) return nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return 0;
    }
}
