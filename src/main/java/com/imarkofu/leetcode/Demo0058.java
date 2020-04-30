package com.imarkofu.leetcode;

/**
 * 最后一个单词的长度
 *
 * @author cglong
 * @version 20200429000
 * 创建Demo0058类
 */
public class Demo0058 {

    public static void main(String[] args) {
        System.out.println(new Demo0058().lengthOfLastWord("Hello World"));
        System.out.println(new Demo0058().lengthOfLastWord(""));
    }

    public int lengthOfLastWord(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        } else {
            int count = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != ' ') {
                    count ++;
                } else if (count != 0) {
                    return count;
                }
            }
            return count;
        }
    }
}
