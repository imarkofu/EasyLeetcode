package com.imarkofu.leetcode.y2020.w35;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Demo0496 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Demo0496().nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})));
        System.out.println(Arrays.toString(
                new Demo0496().nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums2) {
            while (!stack.isEmpty() && stack.peek() < i) {
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}
