package com.imarkofu.leetcode;

import java.util.Arrays;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 *
 * @author cglong
 * @version 20200507000
 * 创建Demo0034类
 */
public class Demo0034 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Demo0034().searchRange(new int[]{5,7,7,8,8,10}, 8)));
        System.out.println(Arrays.toString(new Demo0034().searchRange(new int[]{5,7,7,8,8,10}, 6)));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] rs = new int[]{-1, -1};
        if (null == nums || nums.length == 0) {
            return rs;
        } else if (nums.length == 1) {
            return nums[0] == target ? new int[]{0, 0} : rs;
        } else {
            int ee = nums.length - 1;
            if (nums[0] <= target && nums[ee] >= target) {
                // 查找起点
                int start = 0, end = ee, mid = 0;
                while (start <= end) {
                    mid = (start + end) / 2;
                    if (nums[mid] == target) {
                        if (start == mid || nums[mid - 1] < target) {
                            rs[0] = mid;
                            break;
                        } else {
                            end = mid - 1;
                        }
                    } else if (nums[mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                if (rs[0] != -1) {
                    start = mid;
                    end = ee;
                    while (start <= end) {
                        mid = (start + end) / 2;
                        if (nums[mid] == target) {
                            if (end == mid || nums[mid + 1] > target) {
                                rs[1] = mid;
                                break;
                            } else {
                                start = mid + 1;
                            }
                        } else {
                            // 讲道理不会有小于的情况
                            end = mid - 1;
                        }
                    }
                }

            }
            return rs;
        }
    }
}
