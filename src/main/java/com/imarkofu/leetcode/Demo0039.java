package com.imarkofu.leetcode;

import java.util.*;

/**
 * 组合综合
 *
 * @author cglong
 * @version 20200512000
 * 创建Demo0039类
 */
public class Demo0039 {

    public static void main(String[] args) {
        System.out.println(new Demo0039().combinationSum(new int[]{2,3,6,7}, 7));
        System.out.println(new Demo0039().combinationSum(new int[]{2,3,5}, 8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        check(res, candidates, 0, target, new ArrayDeque<>());
        return res;
    }

    private void check(List<List<Integer>> rs, int[] candidates, int begin, int residue, Deque<Integer> depth) {
        if (0 == residue) {
            rs.add(new ArrayList<>(depth));
            return ;
        }

        for (int i = begin; i < candidates.length; i++) {
            int tmp = residue - candidates[i];
            if (tmp < 0) {
                break;
            }
            depth.add(candidates[i]);
            check(rs, candidates, i, tmp, depth);
            depth.removeLast();
        }
    }
}
