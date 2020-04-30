package com.imarkofu.leetcode;

import java.util.Arrays;

/**
 * 删除排序数组中的重复项
 *
 * @author cglong
 * @version 20200423000
 * 创建Demo0026类
 */
public class Demo0026 {

    public int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int cursor = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (cursor != i) {
                    nums[cursor] = nums[i];
                }
                cursor ++;
            }
        }
        return cursor;
    }

    public static void main(String[] args) {
        System.out.println(new Demo0026().removeDuplicates(new int[]{1,1,2}));
        System.out.println(new Demo0026().removeDuplicates(new int[]{1,2}));
        int[] s = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(new Demo0026().removeDuplicates(s));
        System.out.println(Arrays.toString(s));
    }
}
