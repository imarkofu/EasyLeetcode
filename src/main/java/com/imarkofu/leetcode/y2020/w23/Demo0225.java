package com.imarkofu.leetcode.y2020.w23;

import java.util.LinkedList;

public class Demo0225 {

    class MyStack {

        private LinkedList<Integer> list;

        /** Initialize your data structure here. */
        public MyStack() {
            list = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            list.add(x);
            int k = list.size();
            while (k > 1) {
                list.add(pop());
                k --;
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return list.remove();
        }

        /** Get the top element. */
        public int top() {
            return list.isEmpty() ? -1 : list.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return list.isEmpty();
        }
    }
}
