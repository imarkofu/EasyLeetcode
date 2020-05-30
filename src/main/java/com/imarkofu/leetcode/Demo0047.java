package com.imarkofu.leetcode;

import java.util.*;

/**
 * 全排列Ⅱ
 *
 * @author cglong
 * @version 20200529000
 * 创建Demo0047类
 */
public class Demo0047 {

    public static void main(String[] args) {
        System.out.println(new Demo0047().permuteUnique(new int[]{1,1,2}));
        System.out.println(new Demo0047().permuteUnique(new int[]{3, 3, 0, 3}));
        System.out.println(new Demo0047().permuteUnique(new int[]{0, 1, 0, 0, 9}).size() == 20);
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(nums);
        todo(nums, nums.length, 0, new boolean[nums.length], new ArrayDeque<>(nums.length), list);
        return list;
    }

    public void todo(int[] nums, int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; ++i) {
            if (used[i]) {
                continue;
            }

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            path.addLast(nums[i]);
            used[i] = true;

            todo(nums, len, depth + 1, used, path, res);
            used[i] = false;
            path.removeLast();
        }
    }
}
