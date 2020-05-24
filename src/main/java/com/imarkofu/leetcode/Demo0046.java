package com.imarkofu.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo0046 {

    public static void main(String[] args) {
        System.out.println(new Demo0046().permute(new int[]{1,2,3}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rs = new LinkedList<>();
        if (null != nums && nums.length > 0) {
            todo(rs, nums, 0, nums.length);
        }
        return rs;
    }

    public void todo(List<List<Integer>> rs, int[] nums, int start, int count) {
        if (start == count) {
            rs.add(IntStream.of(nums).boxed().collect(Collectors.toList()));
        } else {
            for (int i = start; i < count; i++) {
                swap(nums, start, i);
                todo(rs, nums, start + 1, count);
                swap(nums, start, i);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
