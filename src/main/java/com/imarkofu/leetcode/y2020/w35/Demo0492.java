package com.imarkofu.leetcode.y2020.w35;

import java.util.Arrays;

public class Demo0492 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Demo0492().constructRectangle(4)));
        System.out.println(Arrays.toString(new Demo0492().constructRectangle(5)));
        System.out.println(Arrays.toString(new Demo0492().constructRectangle(6)));
    }

    public int[] constructRectangle(int area) {
        int start = (int) Math.sqrt(area);
        while (area % start != 0) start --;
        return new int[]{area / start, start};
    }
}
