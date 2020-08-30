package com.imarkofu.leetcode.y2020.w33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo0077 {

    public static void main(String[] args) {
        System.out.println(new Demo0077().combine(4, 2));
        System.out.println(new Demo0077().combine(4, 5));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        todo(1, n, 0, k, result, new Integer[k]);
        return result;
    }

    private void todo(int start, int n, int p, int k, List<List<Integer>> result, Integer[] current) {
        if (0 == k) {
            result.add(new ArrayList<>(Arrays.asList(current)));
            return ;
        }
        for (int i = start; i <= n - k + 1; i++) {
            current[p] = i;
            todo(i + 1, n, p + 1, k - 1, result, current);
        }
    }
}
