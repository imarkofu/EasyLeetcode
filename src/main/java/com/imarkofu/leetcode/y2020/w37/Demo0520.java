package com.imarkofu.leetcode.y2020.w37;

public class Demo0520 {

    public static void main(String[] args) {
        System.out.println(new Demo0520().detectCapitalUse("USA"));
        System.out.println(new Demo0520().detectCapitalUse("FlaG"));
        System.out.println(new Demo0520().detectCapitalUse("Flag"));
        System.out.println(new Demo0520().detectCapitalUse("false"));
        System.out.println(new Demo0520().detectCapitalUse("falsE"));
    }

    public boolean detectCapitalUse(String word) {
        if (null == word || word.isEmpty()) return true;
        boolean up = word.charAt(0) <= 'Z';
        for (int i = 1; i < word.length(); i++) {
            if (up) {
                if (i == 1) {
                    up = word.charAt(i) <= 'Z';
                } else if (word.charAt(i) > 'Z') {
                    return false;
                }
            } else if (word.charAt(i) <= 'Z') {
                return false;
            }
        }

        return true;
    }
}
