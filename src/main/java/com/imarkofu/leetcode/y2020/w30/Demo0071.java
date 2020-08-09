package com.imarkofu.leetcode.y2020.w30;

import java.util.Stack;

public class Demo0071 {

    public static void main(String[] args) {
        System.out.println(new Demo0071().simplifyPath("/home/").equals("/home"));
        System.out.println(new Demo0071().simplifyPath("/../").equals("/"));
        System.out.println(new Demo0071().simplifyPath("/home//foo/").equals("/home/foo"));
        System.out.println(new Demo0071().simplifyPath("/a/./b/../../c/").equals("/c"));
        System.out.println(new Demo0071().simplifyPath("/a/../../b/../c//.//").equals("/c"));
        System.out.println(new Demo0071().simplifyPath("/a//b////c/d//././/..").equals("/a/b/c"));
    }

    public String simplifyPath(String path) {
        path += "/";
        char[] chs = path.toCharArray();
        int start = -1;
        for (char ch : chs) {
            if (start == -1 || ch != '/') {
                chs[++start] = ch;
            } else if (start >= 1 && chs[start] == '.' && chs[start - 1] == '/') {
                start --;
            } else if (start >= 2 && chs[start] == '.' && chs[start - 1] == '.' && chs[start - 2] == '/') {
                start -= 2;
                while (start > 0 && chs[--start] != '/');
            } else if (chs[start] != '/') {
                chs[++ start] = ch;
            }
        }
        if (start > 0 && chs[start] == '/') {
            start --;
        }
        return new String(chs, 0, start + 1);
    }

    public String simplifyPath1(String path) {
        Stack<String> stack = new Stack<>();
        for (String s : path.split("/")) {
            if ("..".equals(s)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.isEmpty() && !".".equals(s)) {
                stack.push(s);
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            if (result.isEmpty()) {
                result = stack.pop();
            } else {
                result = stack.pop() + "/" + result;
            }
        }
        return "/" + result;
    }
}
