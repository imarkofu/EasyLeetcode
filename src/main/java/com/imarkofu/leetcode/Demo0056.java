package com.imarkofu.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 合并区间
 *
 * @author cglong
 * @version 20200612000
 * 创建Demo0056类
 */
public class Demo0056 {

    public static void main(String[] args) {
        int[][] tp = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        tp = new Demo0056().merge(tp);
        for (int[] ints : tp) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("===========");
        tp = new int[][]{{1,4},{4,5}};
        tp = new Demo0056().merge(tp);
        for (int[] ints : tp) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public int[][] merge(int[][] intervals) {
        if (null == intervals) {
            return null;
        } else if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int cur = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[cur][1] >= intervals[i][0]) {
                if (intervals[cur][1] < intervals[i][1]) {
                    intervals[cur][1] = intervals[i][1];
                }
            } else {
                cur ++;
                if (cur != i) {
                    intervals[cur] = intervals[i];
                }
            }
        }
        return Arrays.copyOf(intervals, cur + 1);
    }
}
