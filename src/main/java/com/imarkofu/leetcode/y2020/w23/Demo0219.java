package com.imarkofu.leetcode.y2020.w23;

import java.util.HashSet;
import java.util.Set;

public class Demo0219 {

    public static void main(String[] args) {
        System.out.println(new Demo0219().containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
        System.out.println(new Demo0219().containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 3));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
            if (i >= k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
