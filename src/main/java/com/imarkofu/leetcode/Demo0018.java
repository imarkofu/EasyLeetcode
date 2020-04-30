package com.imarkofu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和
 *
 * @author cglong
 * @version 20200420000
 * 创建Demo0018类
 */
public class Demo0018 {

    public static void main(String[] args) {
        System.out.println(new Demo0018().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (null == nums || nums.length < 4) {
            return new ArrayList<>();
        } else {
            Arrays.sort(nums);

            /*
            参考题解后优化方向
                提前计算最大值与最小值
                如果最大值小于target则放弃遍历
                如果最小值大于target则放弃遍历
             */
            List<List<Integer>> rs = new ArrayList<>();
            int l4 = nums.length - 4, l3 = nums.length - 3, l2 = nums.length - 2, l1 = nums.length - 1;
            for (int i = 0; i < l3; i++) {
                for (int j = i + 1; j < l2; j++) {
                    for (int k = j + 1; k < l1; k++) {
                        for (int l = k + 1; l < nums.length; l++) {
                            if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                                rs.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                            }
                            while (l < l1 && nums[l] == nums[l + 1]) {
                                l ++;
                            }
                        }
                        while (k < l2 && nums[k] == nums[k + 1]) {
                            k ++;
                        }
                    }
                    while (j < l3 && nums[j] == nums[j + 1]) {
                        j ++;
                    }
                }
                while (i < l4 && nums[i] == nums[i + 1]) {
                    i ++;
                }
            }
            return rs;
        }
    }
}
