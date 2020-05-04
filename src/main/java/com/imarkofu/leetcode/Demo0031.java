package com.imarkofu.leetcode;

import java.util.Arrays;

public class Demo0031 {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        System.out.print(Arrays.toString(a) + " => ");
        new Demo0031().nextPermutation(a);
        System.out.println(Arrays.toString(a));

        a = new int[]{3, 2, 1};
        System.out.print(Arrays.toString(a) + " => ");
        new Demo0031().nextPermutation(a);
        System.out.println(Arrays.toString(a));

        a = new int[]{1, 1, 5};
        System.out.print(Arrays.toString(a) + " => ");
        new Demo0031().nextPermutation(a);
        System.out.println(Arrays.toString(a));

        a = new int[]{1, 3, 2};
        System.out.print(Arrays.toString(a) + " => ");
        new Demo0031().nextPermutation(a);
        System.out.println(Arrays.toString(a));

        a = new int[]{2, 3, 1};
        System.out.print(Arrays.toString(a) + " => ");
        new Demo0031().nextPermutation(a);
        System.out.println(Arrays.toString(a));
    }

    /**
     * 1,2,3 → 1,3,2
     * 3,2,1 → 1,2,3
     * 1,1,5 → 1,5,1
     * 1354
     */
    public void nextPermutation(int[] nums) {
        if (null != nums && nums.length > 1) {
            int i = nums.length - 1, m = i, tmp;
            for (; i > 0; i--) {
                if (nums[i] > nums[i - 1]) {
                    // 找个最小的交换结束
                    tmp = i;
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] > nums[i - 1] && nums[j] < nums[tmp]) {
                            tmp = j;
                        }
                    }
                    int t = nums[i - 1];
                    nums[i - 1] = nums[tmp];
                    nums[tmp] = t;

                    // 降序
                    Arrays.sort(nums, i, nums.length);

                    return ;
                }
            }
            // 反转
            int t = nums.length / 2;
            for (int j = 0, k = m; j < t; j++, k --) {
                tmp = nums[j];
                nums[j] = nums[k];
                nums[k] = tmp;
            }
        }
    }
}
