package com.imarkofu.leetcode.y2020.w36;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo0506 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Demo0506().findRelativeRanks(new int[]{5,4,3,2,1})));
        System.out.println(Arrays.toString(new Demo0506().findRelativeRanks(new int[]{})));
        System.out.println(Arrays.toString(new Demo0506().findRelativeRanks(new int[]{8,33,21,4})));
    }

    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);
        Arrays.sort(nums);
        String[] result = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            result[map.get(nums[i])] = get(nums.length - i);
        return result;
    }

    private String get(int p) {
        switch (p) {
            case 1: return "Gold Medal";
            case 2: return "Silver Medal";
            case 3: return "Bronze Medal";
            default: return Integer.toString(p);
        }
    }
}
