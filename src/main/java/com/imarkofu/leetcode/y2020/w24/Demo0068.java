package com.imarkofu.leetcode.y2020.w24;

import java.util.LinkedList;
import java.util.List;

public class Demo0068 {

    public static void main(String[] args) {
        System.out.println(new Demo0068().fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> rs = new LinkedList<>();
        int start = 0, end;
        while (start < words.length) {
            end = end(words, start, maxWidth);
            rs.add(fill(words, start, end, maxWidth));
            start = end + 1;
        }
        return rs;
    }

    private int end(String[] words, int start, int maxWidth) {
        int cur = 0, end = start;
        for (; end < words.length; end++) {
            if (cur + words[end].length() > maxWidth) {
                return end - 1;
            }
            cur += (words[end].length() + 1);
        }
        return end - 1;
    }

    private String fill(String[] words, int start, int end, int maxWidth) {
        StringBuilder sb = new StringBuilder(maxWidth);
        if (start == end) {
            sb.append(words[start]).append(kg(maxWidth - words[start].length()));
        } else if (end == words.length - 1) {
            for (int i = start; i <= end; i++) {
                if (sb.length() != 0) {
                    sb.append(" ");
                }
                sb.append(words[i]);
            }
            sb.append(kg(maxWidth - sb.length()));
        } else {
            int size = 0;
            for (int i = start; i <= end; i++) {
                size += words[i].length();
            }
            int kg = maxWidth - size;
            int tp = end - start;
            int every = kg / tp;
            int remain = kg % tp;
            String kg1 = kg(every);
            String kg2 = (remain > 0) ? kg(every + 1) : kg1;
            for (int i = start; i <= end; i++) {
                if (sb.length() != 0) {
                    if (remain > 0) {
                        remain --;
                        sb.append(kg2);
                    } else {
                        sb.append(kg1);
                    }
                }
                sb.append(words[i]);
            }
        }

        return sb.toString();
    }

    private String kg(int size) {
        if (0 == size) {
            return "";
        } else if (size == 1) {
            return " ";
        }
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
