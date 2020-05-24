package com.imarkofu.leetcode;

import java.util.Arrays;

public class Demo0167 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Demo0167().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1, tmp;
        while (i < j) {
            tmp = numbers[i] + numbers[j];
            if (tmp == target) {
                return new int[]{i + 1, j + 1};
            } else if (tmp > target) {
                j --;
            } else {
                i ++;
            }
        }

        return null;
    }
}
