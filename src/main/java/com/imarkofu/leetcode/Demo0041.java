package com.imarkofu.leetcode;

/**
 * 缺失的第一个正数
 *
 * @author cglong
 * @version 20200517000
 * 创建Demo0041类
 */
public class Demo0041 {

    public static void main(String[] args) {
        System.out.println(new Demo0041().firstMissingPositive(new int[]{1,2,0}));
        System.out.println(new Demo0041().firstMissingPositive(new int[]{3,4,-1,1}));
        System.out.println(new Demo0041().firstMissingPositive(new int[]{7,8,9,11,12}));
    }

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
