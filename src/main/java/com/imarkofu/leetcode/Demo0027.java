package com.imarkofu.leetcode;

import java.util.Arrays;

/**
 * 移除元素
 *
 * @author cglong
 * @version 20200424000
 * 创建Demo0027类
 */
public class Demo0027 {

    public int removeElement(int[] nums, int val) {
        if (null == nums || nums.length == 0) {
            return 0;
        } else {
            int cursor = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    if (cursor != i) {
                        nums[cursor] = nums[i];
                    }
                    cursor ++;
                }
            }
            return cursor;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Demo0027().removeElement(new int[]{3,2,2,3}, 3));
        int[] s = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(new Demo0027().removeElement(s, 2));
        System.out.println(Arrays.toString(s));
    }
}
