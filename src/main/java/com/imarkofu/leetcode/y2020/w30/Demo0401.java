package com.imarkofu.leetcode.y2020.w30;

import java.util.ArrayList;
import java.util.List;

public class Demo0401 {

    public static void main(String[] args) {
        System.out.println(new Demo0401().readBinaryWatch(0));
        System.out.println(new Demo0401().readBinaryWatch(1));
        System.out.println(new Demo0401().readBinaryWatch(10));
    }

    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        tmp(result, new int[]{8,4,2,1,32,16,8,4,2,1}, 0, 10, num, 0, 0);
        return result;
    }

    private void tmp(List<String> result, int[] source, int start, int total, int num, int hour, int minute) {
        if (num == 0) {
            if (hour < 12 && minute < 60) {
                result.add(hour + ":" + (minute < 10 ? "0" + minute : minute));
            }
        } else {
            for (int i = start; i <= total - num; i++) {
                if (i < 4) {
                    tmp(result, source, i + 1, total, num - 1, hour + source[i], minute);
                } else {
                    tmp(result, source, i + 1, total, num - 1, hour, minute + source[i]);
                }
            }
        }
    }

    // public List<String> readBinaryWatch(int num) {
    //     List<String> result = new ArrayList<>();
    //     tmp(result, 0, 10, 0, num);
    //     return result;
    // }
    //
    // private void tmp(List<String> result, int start, int total, int cur, int num) {
    //     if (num == 0) {
    //         int minute = cur & 0x3f;
    //         int hour = (cur >> 6) & 0x0f;
    //         if (hour < 12 && minute < 60) {
    //             result.add(hour + ":" + (minute < 10 ? "0" + minute : minute));
    //         }
    //         return ;
    //     }
    //     for (int i = start; i <= total - num; i++) {
    //         tmp(result, i + 1, total, cur | 1<<i, num - 1);
    //     }
    // }
}
