package com.imarkofu.leetcode.y2020.w24;

public class Demo0061 {

    public ListNode rotateRight(ListNode head, int k) {
        if (null == head || null == head.next) {
            return head;
        } else {
            int size = 0;
            ListNode ln = head;
            while (null != ln) {
                size ++;
                ln = ln.next;
            }
            k = k % size;
            k = size - k;
            // 找到新的头
            ln = head;
            while (true) {
                k --;
                if (k == 0) {
                    ListNode tmp = ln.next;
                    ln.next = null;
                    ln = tmp;
                    break;
                }
                ln = ln.next;
            }
            ListNode newHead = ln;
            while (null != ln.next) {
                ln = ln.next;
            }
            ln.next = head;
            return newHead;
        }
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
