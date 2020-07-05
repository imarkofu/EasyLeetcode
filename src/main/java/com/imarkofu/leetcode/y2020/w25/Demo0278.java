package com.imarkofu.leetcode.y2020.w25;

public class Demo0278 {

    private static int target = 0;
    public static void main(String[] args) {
        target = 1;
        System.out.println(new Demo0278().firstBadVersion(5));
        target = 2;
        System.out.println(new Demo0278().firstBadVersion(5));
        target = 3;
        System.out.println(new Demo0278().firstBadVersion(5));
        target = 4;
        System.out.println(new Demo0278().firstBadVersion(5));
        target = 5;
        System.out.println(new Demo0278().firstBadVersion(5));
    }

    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (isBadVersion(middle)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }

    private boolean isBadVersion(int middle) {

        return middle >= target;
    }
}
