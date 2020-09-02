package com.imarkofu.leetcode.y2020.w35;

public class Demo0081 {

    public static void main(String[] args) {
        System.out.println(new Demo0081().search(new int[]{2,5,6,0,0,1,2}, 0));
        System.out.println(new Demo0081().search(new int[]{2,5,6,0,0,1,2}, 3));
        System.out.println(new Demo0081().search(new int[]{1,1,3,1}, 3));
        System.out.println(new Demo0081().search(new int[]{5,1,3}, 3));
    }

    public boolean search(int[] nums, int target) {
        if (null == nums || nums.length <= 0) return false;
        int start = 0, end = nums.length - 1, middle;

        while (start <= end) {
            middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return true;
            } else if (nums[start] == nums[middle]) {
                start ++;
            } else if (nums[start] < nums[middle]) {
                // start到middle有序
                if (nums[middle] > target && target >= nums[start]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                // middle到end有序
                if (nums[middle] < target && target <= nums[end]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return false;
    }
}
