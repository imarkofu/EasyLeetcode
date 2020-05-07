package com.imarkofu.leetcode;

/**
 * 搜索旋转排序数组
 *
 * @author cglong
 * @version 20200507000
 * 创建Demo0033类
 */
public class Demo0033 {

    public static void main(String[] args) {
        System.out.println(new Demo0033().search(new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println(new Demo0033().search(new int[]{4,5,6,7,0,1,2}, 3));
    }

    public int search(int[] nums, int target) {
        if (null == nums || nums.length <= 0) {
            return -1;
        } else {
            // 找到最小点
            int ee = nums.length - 1, start = 0, end = ee;
            while (start != end) {
                int mid = (start + end) / 2;
                if (nums[mid] > nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            if (target < nums[start] || (start == 0 && target > nums[ee]) || (start != 0 && target > nums[start - 1])) {
                return -1;
            } else if (target == nums[ee]) {
                return ee;
            } else if (target < nums[ee]) {
                return search(nums, start, ee, target);
            } else {
                return search(nums, 0, start, target);
            }
        }
    }

    public int search(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        } else if (start == end) {
            return nums[start] == target ? start : -1;
        } else {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return search(nums, start, mid - 1, target);
            } else {
                return search(nums, mid + 1, end, target);
            }
        }
    }
}
