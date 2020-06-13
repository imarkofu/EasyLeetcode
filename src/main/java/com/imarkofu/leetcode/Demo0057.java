package com.imarkofu.leetcode;

import java.util.Arrays;

/**
 * 插入区间
 *
 * @author cglong
 * @version 20200613000
 * 创建Demo0057类
 */
public class Demo0057 {

    public static void main(String[] args) {
        int[][] pp = new int[][]{{1,3},{6,9}};
        pp = new Demo0057().insert(pp, new int[]{2,5});
        for (int[] ints : pp) {
            System.out.print(Arrays.toString(ints));
        }
        System.out.println();
        System.out.println("=============");
        pp = new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}};
        pp = new Demo0057().insert(pp, new int[]{4,8});
        for (int[] ints : pp) {
            System.out.print(Arrays.toString(ints));
        }
        System.out.println();
        System.out.println("=============");
        pp = new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}};
        pp = new Demo0057().insert(pp, new int[]{24,28});
        for (int[] ints : pp) {
            System.out.print(Arrays.toString(ints));
        }
        System.out.println();
        System.out.println("=============");
        pp = new int[][]{};
        pp = new Demo0057().insert(pp, new int[]{4,8});
        for (int[] ints : pp) {
            System.out.print(Arrays.toString(ints));
        }
        System.out.println();
        System.out.println("=============");
        pp = new int[][]{{1,5}};
        pp = new Demo0057().insert(pp, new int[]{2,3});
        for (int[] ints : pp) {
            System.out.print(Arrays.toString(ints));
        }
        System.out.println();
        System.out.println("=============");
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] nn = new int[intervals.length + 1][2];
        int cur = 0, i = 0;
        for (; i < intervals.length; i++) {
            if (intervals[i][0] > newInterval[1]) {
                nn[cur++] = newInterval;
                nn[cur++] = intervals[i ++];
                break;
            } else if (intervals[i][1] >= newInterval[0]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            } else {
                nn[cur++] = intervals[i];
            }
        }
        if (i == intervals.length) {
            if (cur == 0 || nn[cur - 1][1] < newInterval[0]) {
                nn[cur ++] = newInterval;
            }
        } else {
            for (; i < intervals.length; i++) {
                nn[cur++] = intervals[i];
            }
        }
        return cur != nn.length ? Arrays.copyOf(nn, cur) : nn;
    }
}
