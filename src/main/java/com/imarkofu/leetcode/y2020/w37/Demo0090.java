package com.imarkofu.leetcode.y2020.w37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo0090 {

    public static void main(String[] args) {
        System.out.println(new Demo0090().subsetsWithDup(new int[]{}));
        System.out.println(new Demo0090().subsetsWithDup(null));
        System.out.println(new Demo0090().subsetsWithDup(new int[]{1,2,2}));
        System.out.println(new Demo0090().subsetsWithDup(new int[]{2,2,2}));
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (null == nums || nums.length == 0) return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            find(nums, result, new int[i], 0, 0, i);
        }
        return result;
    }

    private void find(int[] nums, List<List<Integer>> result, int[] current, int start, int position, int total) {
        if (position == total) {
            List<Integer> list = new ArrayList<>(total);
            for (int i : current)
                list.add(i);
            result.add(list);
            return ;
        }
        for (int i = start; i < nums.length - total + position + 1; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            current[position] = nums[i];
            find(nums, result, current, i + 1, position + 1, total);
        }
    }
}
