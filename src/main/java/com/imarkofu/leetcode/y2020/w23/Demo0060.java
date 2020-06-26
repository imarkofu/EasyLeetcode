package com.imarkofu.leetcode.y2020.w23;

public class Demo0060 {

    public static void main(String[] args) {
        System.out.println(new Demo0060().getPermutation(3, 3));
        System.out.println(new Demo0060().getPermutation(4, 9));
    }

    public String getPermutation(int n, int k) {
        boolean[] used = new boolean[n];
        int[] tmp = new int[n];
        todo(used, 0, 0, k, tmp);
        StringBuilder sb = new StringBuilder();
        for (int i : tmp) {
            sb.append(i);
        }
        return sb.toString();
    }

    private int todo(boolean[] used, int level, int cur, int target, int[] tmp) {
        if (level == used.length) {
            return cur + 1;
        }
        for (int i = 0; i < used.length; i++) {
            if (!used[i]) {
                tmp[level] = i + 1;
                used[i] = true;
                cur = todo(used, level + 1, cur, target, tmp);
                if (target == cur) {
                    return cur;
                }
                used[i] = false;
            }
        }

        return cur;
    }
}
