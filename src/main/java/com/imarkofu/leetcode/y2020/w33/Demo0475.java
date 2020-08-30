package com.imarkofu.leetcode.y2020.w33;

import java.util.Arrays;

public class Demo0475 {

    public static void main(String[] args) {
        // System.out.println(new Demo0475().findRadius(new int[]{1,2,3}, new int[]{2}));
        // System.out.println(new Demo0475().findRadius(new int[]{1,2,3,4}, new int[]{1,4}));
        System.out.println(new Demo0475().findRadius(new int[]{1,8}, new int[]{2,3,4}));
    }

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = 0;
        int tp = 0;
        int n = heaters.length - 1;
        for (int i = 0, j = 0; i < houses.length && j < heaters.length; ) {
            if (houses[i] <= heaters[j]) {
                tp = heaters[j] - houses[i ++];
            } else if (j < n) {
                tp = Math.min(heaters[j+1] - houses[i], houses[i] - heaters[j]);
                if (houses[i] < heaters[j + 1]) {
                    i++;
                } else {
                    j ++;
                }
            } else if (j == n) {
                res = Math.max(res, houses[houses.length - 1] - heaters[j]);
                break;
            }
            res = Math.max(tp, res);
        }

        return res;
    }
}
