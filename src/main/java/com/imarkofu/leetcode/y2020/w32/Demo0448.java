package com.imarkofu.leetcode.y2020.w32;

import java.util.LinkedList;
import java.util.List;

public class Demo0448 {

    public static void main(String[] args) {
        System.out.println(new Demo0448().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(new Demo0448().findDisappearedNumbers(new int[]{1,1}));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int target, p;
        for (int i = 1, j = 0; j < nums.length; i++, j ++) {
            while (nums[j] != i && nums[p = nums[j] - 1] != nums[j]) {
                target = nums[p];
                nums[p] = nums[j];
                nums[j] = target;
            }
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 1, j = 0; j < nums.length; i++, j ++) {
            if (nums[j] != i) {
                list.add(i);
            }
        }
        return list;
    }
}
