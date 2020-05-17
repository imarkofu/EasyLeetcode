package com.imarkofu.leetcode;

import java.util.*;

/**
 * 组合总和Ⅱ
 *
 * @author cglong
 * @version 20200512000
 * 创建Demo0040类
 */
public class Demo0040 {

    public static void main(String[] args) {
        System.out.println(new Demo0040().combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
        System.out.println(new Demo0040().combinationSum2(new int[]{2,5,2,1,2}, 5));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        check(res, candidates, 0, target, new ArrayDeque<>());

        return res;
    }

    private void check(List<List<Integer>> res, int[] candidates, int begin, int reside, Deque<Integer> depth) {
        if (0 == reside) {
            res.add(new ArrayList<>(depth));
        } else {
            for (int i = begin; i < candidates.length; i++) {
                if (i > begin && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                int tmp = reside - candidates[i];
                if (tmp < 0) {
                    return ;
                }
                depth.add(candidates[i]);
                check(res, candidates, i + 1, tmp, depth);
                depth.removeLast();
            }
        }
    }
}
