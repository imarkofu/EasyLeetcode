package com.imarkofu.leetcode.y2020.w38;

import java.util.Arrays;

public class Demo0561 {

    public static void main(String[] args) {
        System.out.println(new Demo0561().arrayPairSum(new int[]{1,3,4,2}));
    }

    public int arrayPairSum(int[] nums) {
        if (null == nums || nums.length <= 0) return 0;
        int result = 0;
        int[] hash = new int[20001];
        for (int num : nums) {
            hash[num + 10000] ++;
        }
        boolean contain = false;
        int pre = 0;
        for (int i = 0; i <= 20000; i++) {
            while (hash[i] -- > 0) {
                if (contain) {
                    result += pre;
                } else {
                    pre = i - 10000;
                }
                contain = !contain;
            }
        }
        return result;
    }
    public int arrayPairSum2(int[] nums) {
        if (null == nums || nums.length <= 0) return 0;
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i+=2) {
            result += nums[i];
        }
        return result;
    }
}
