package com.imarkofu.leetcode;

import java.util.*;

public class Demo0030 {

    public static void main(String[] args) {
        System.out.println(new Demo0030().findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
        System.out.println(new Demo0030().findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
        System.out.println(new Demo0030().findSubstring("11111111", new String[]{"1"}));
    }

    public List<Integer> findSubstring(String s, String[] words) {
        if (null == words || words.length <= 0) {
            return Collections.emptyList();
        }
        HashMap<String, Integer> stat = new HashMap<>(words.length);
        for (String word : words) {
            if (stat.containsKey(word)) {
                stat.put(word, stat.get(word) + 1);
            } else {
                stat.put(word, 1);
            }
        }
        int length = words[0].length(), end = s.length() - length * words.length;
        List<Integer> list = new ArrayList<>(end);
        for (int i = 0; i <= end; i++) {
            Map<String, Integer> mm = (Map<String, Integer>) stat.clone();
            for (int j = 0; j < words.length; j++) {
                int start = i + j * length;
                String tp = s.substring(start, start + length);
                if (mm.containsKey(tp)) {
                    if (mm.get(tp) > 1) {
                        mm.put(tp, mm.get(tp)  - 1);
                    } else {
                        mm.remove(tp);
                    }
                } else {
                    break;
                }
            }
            if (mm.size() == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
