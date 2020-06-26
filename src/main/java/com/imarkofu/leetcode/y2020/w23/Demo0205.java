package com.imarkofu.leetcode.y2020.w23;

public class Demo0205 {


    public static void main(String[] args) {
        System.out.println(new Demo0205().isIsomorphic("add", "egg"));
        System.out.println(new Demo0205().isIsomorphic("abc", "egg"));
    }

    public boolean isIsomorphic(String s, String t) {
        char[] ch1 = new char[128];
        char[] ch2 = new char[128];
        for (int i = 0; i < s.length(); i++) {
            if (ch1[s.charAt(i)] == 0 && ch2[t.charAt(i)] == 0) {
                ch1[s.charAt(i)] = t.charAt(i);
                ch2[t.charAt(i)] = s.charAt(i);
            } else if (ch1[s.charAt(i)] != t.charAt(i) || ch2[t.charAt(i)] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
