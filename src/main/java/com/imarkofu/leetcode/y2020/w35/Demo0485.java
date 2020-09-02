package com.imarkofu.leetcode.y2020.w35;

public class Demo0485 {

    public static void main(String[] args) {
        System.out.println(new Demo0485().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(new Demo0485().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, tmp = 0;
        for (int num : nums) {
            if (num == 1) {
                tmp ++;
            } else if (tmp > 0) {
                result = Math.max(result, tmp);
                tmp = 0;
            }
        }
        return Math.max(result, tmp);
    }
}
