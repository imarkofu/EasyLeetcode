package com.imarkofu.leetcode.y2020.w37;

public class Demo0521 {

    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
