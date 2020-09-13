package com.imarkofu.leetcode.y2020.w36;

import java.util.Arrays;

public class Demo0500 {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new Demo0500().findWords(new String[]{"Hello","Alaska","Dad","Peace","","zZxcvbnm"})));
    }

    public String[] findWords(String[] words) {
        if (null == words || words.length <= 0) return new String[0];

        int p = 0;
        char[] chs = get();
        boolean line;
        for (int j = 0; j < words.length; j++) {
            line = true;
            if (null != words[j] && !words[j].isEmpty()) {
                for (int i = 1; i < words[j].length(); i++) {
                    if (chs[words[j].charAt(0)] != chs[words[j].charAt(i)]) {
                        line = false;
                        break;
                    }
                }
            }
            if (line) {
                if (p != j) {
                    words[p] = words[j];
                }
                p ++;
            }
        }

        return p == 0 ? new String[0] : Arrays.copyOf(words, p);
    }

    private char[] get() {
        char[] chs = new char[123];
        for (int i = 'A'; i <= 'Z'; i++) {
            switch (i) {
                case 'Q':
                case 'W':
                case 'E':
                case 'R':
                case 'T':
                case 'Y':
                case 'U':
                case 'I':
                case 'O':
                case 'P':
                    chs[i] = 1;
                    chs[i + 32] = 1;
                    break;
                case 'A':
                case 'S':
                case 'D':
                case 'F':
                case 'G':
                case 'H':
                case 'J':
                case 'K':
                case 'L':
                    chs[i] = 2;
                    chs[i + 32] = 2;
                    break;
                default:
                    chs[i] = 3;
                    chs[i + 32] = 3;
                    break;
            }
        }
        return chs;
    }
}
