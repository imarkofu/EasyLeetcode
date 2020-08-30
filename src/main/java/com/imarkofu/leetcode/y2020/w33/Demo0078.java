package com.imarkofu.leetcode.y2020.w33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo0078 {

    public static void main(String[] args) {
        System.out.println(new Demo0078().subsets(new int[]{1,2,3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i <= nums.length; i++) {
            todo(nums, 0, nums.length, 0, i, result, new Integer[i]);
        }
        return result;
    }

    private void todo(int[] nums, int start, int n, int p, int k, List<List<Integer>> result, Integer[] current) {
        if (0 == k) {
            result.add(new ArrayList<>(Arrays.asList(current)));
            return ;
        }
        for (int i = start; i <= n - k; i++) {
            current[p] = nums[i];
            todo(nums, i + 1, n, p + 1, k - 1, result, current);
        }
    }
}
