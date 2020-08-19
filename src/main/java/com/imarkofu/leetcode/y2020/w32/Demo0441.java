package com.imarkofu.leetcode.y2020.w32;

public class Demo0441 {

    public static void main(String[] args) {
        // System.out.println(new Demo0441().arrangeCoins(1));
        // System.out.println(new Demo0441().arrangeCoins(5));
        System.out.println(new Demo0441().arrangeCoins(1804289383));
    }

    public int arrangeCoins(int n) {
        int start = 1, end = n, middle;
        long result;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if ((result = (middle + 1L) * middle / 2) == n) {
                return middle;
            } else if (result > n) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return end;
    }
}
