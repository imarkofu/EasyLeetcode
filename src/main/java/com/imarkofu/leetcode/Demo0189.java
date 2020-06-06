package com.imarkofu.leetcode;

import java.util.Arrays;

/**
 * 旋转数组
 *
 * @author cglong
 * @version 20200601000
 * 创建Demo0189类
 */
public class Demo0189 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        new Demo0189().rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{-1,-100,3,99};
        new Demo0189().rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int count = 0;
        for (int i = 0; count < nums.length; i++) {
            int current = i;
            int prev = nums[i];
            do {
                int next = (current + k) % nums.length;
                int tmp = nums[next];
                nums[next] = prev;
                prev = tmp;
                current = next;
                count ++;
            } while (i != current);
        }
    }
}
