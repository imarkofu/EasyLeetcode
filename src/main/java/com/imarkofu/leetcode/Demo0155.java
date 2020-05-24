package com.imarkofu.leetcode;

import java.util.Stack;

public class Demo0155 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    static class MinStack {
        private Stack<Integer> ori;
        private Stack<Integer> min;
        public MinStack() {
            ori = new Stack<>();
            min = new Stack<>();
        }

        public void push(int x) {
            ori.push(x);
            if (min.isEmpty() || min.peek() >= x) {
                min.push(x);
            }
        }

        public void pop() {
            if (ori.pop().equals(min.peek())) {
                min.pop();
            }

        }

        public int top() {
            return ori.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }
}
