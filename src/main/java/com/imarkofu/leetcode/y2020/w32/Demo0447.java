package com.imarkofu.leetcode.y2020.w32;

import java.util.HashMap;
import java.util.Map;

public class Demo0447 {

    public static void main(String[] args) {
        System.out.println(new Demo0447().numberOfBoomerangs(new int[][]{{0,0},{1,0},{2,0}}));
    }

    public int numberOfBoomerangs(int[][] points) {
        int distance, res = 0;
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {

                distance = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0])
                        + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                Map<Integer, Integer> pp = map.computeIfAbsent(i, k -> new HashMap<>());
                pp.put(distance, pp.getOrDefault(distance, 0) + 1);
                pp = map.computeIfAbsent(j, k -> new HashMap<>());
                pp.put(distance, pp.getOrDefault(distance, 0) + 1);
            }
        }
        for (Map<Integer, Integer> value : map.values()) {
            for (Integer count : value.values()) {
                if (count > 1) {
                    res += count * (count -1);
                }
            }
        }
        return res;
    }
}
