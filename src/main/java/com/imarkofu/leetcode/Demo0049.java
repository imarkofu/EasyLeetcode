package com.imarkofu.leetcode;

import java.util.*;

/**
 * 字母异位词分组
 *
 * @author cglong
 * @version 20200607000
 * 创建Demo0049类
 */
public class Demo0049 {

    public static void main(String[] args) {
        System.out.println(new Demo0049().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int[] tp = new int[26];
        for (String str : strs) {
            Arrays.fill(tp, 0);
            for (char ch : str.toCharArray()) {
                tp[ch-'a'] ++;
            }
            StringBuilder sb = new StringBuilder(26*3);
            for (int i : tp) {
                sb.append("#").append(i);
            }
            map.computeIfAbsent(sb.toString(), s -> new LinkedList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    // public List<List<String>> groupAnagrams(String[] strs) {
    //
    //     Map<String, List<String>> map = new HashMap<>();
    //
    //     for (String str : strs) {
    //         char[] chs = str.toCharArray();
    //         Arrays.sort(chs);
    //         String key = new String(chs);
    //         map.computeIfAbsent(key, s -> new LinkedList<>()).add(str);
    //     }
    //
    //     return new ArrayList<>(map.values());
    // }
}
