package com.imarkofu.leetcode;

/**
 * 搜索插入位置
 *
 * @author cglong
 * @version 20200424000
 * 创建Demo0035类
 */
public class Demo0035 {

    public static void main(String[] args) {
        System.out.println(new Demo0035().searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(new Demo0035().searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(new Demo0035().searchInsert(new int[]{1,3,5,6}, 7));
        System.out.println(new Demo0035().searchInsert(new int[]{1,3,5,6}, 0));
    }

    public int searchInsert(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return 0;
        } else {
            int start = 0;
            int end = nums.length - 1;
            while (start < end) {
                int middle = (start + end) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (nums[middle] > target) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
            return nums[start] >= target ? start : start + 1;
        }
    }
}
