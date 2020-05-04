package com.imarkofu.leetcode;

public class Demo0083 {

    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(1);
        ln.next.next = new ListNode(2);
        ln = new Demo0083().deleteDuplicates(ln);
        while (null != ln) {
            System.out.println(ln.val);
            ln = ln.next;
        }

        ln = new ListNode(1);
        ln.next = new ListNode(1);
        ln.next.next = new ListNode(2);
        ln.next.next.next = new ListNode(3);
        ln.next.next.next.next = new ListNode(3);
        ln = new Demo0083().deleteDuplicates(ln);
        while (null != ln) {
            System.out.println(ln.val);
            ln = ln.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (null != head && null != head.next) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
                deleteDuplicates(head);
            } else {
                deleteDuplicates(head.next);
            }
        }
        return head;
    }


    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
