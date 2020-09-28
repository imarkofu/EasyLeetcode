package com.imarkofu.leetcode.y2020.w38;

public class Demo0092 {

    public static void main(String[] args) {
        Demo0092 d = new Demo0092();
        d.print(d.reverseBetween(d.get(), 2, 4));
        d.print(d.reverseBetween(d.get(), 1, 5));
        d.print(d.reverseBetween(d.get(), 1, 1));
        d.print(d.reverseBetween(d.get(), 1, 2));
        d.print(d.reverseBetween(d.get(), 4, 5));
        d.print(d.reverseBetween(d.get(), 5, 5));
    }

    private ListNode get() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        return root;
    }

    private void print(ListNode head) {
        while (null != head) {
            System.out.print(head.val + " => ");
            head = head.next;
        }
        System.out.println();
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (null == head || null == head.next || m == n) return head;
        ListNode cur = head, preCur = null, tail = null, newHead = null, tmp;
        for (int i = 1; i <= n; i++) {
            if (i < m) {
                preCur = cur;
                cur = cur.next;
            } else if (i == m) {
                tail = cur;
                newHead = cur;
                cur = cur.next;
            } else if (i < n) {
                tmp = cur;
                cur = cur.next;
                tmp.next = newHead;
                newHead = tmp;
            } else if (i == n) {
                tmp = cur;
                cur = cur.next;
                tmp.next = newHead;
                newHead = tmp;
                tail.next = cur;
                if (null == preCur) {
                    return newHead;
                } else {
                    preCur.next = newHead;
                    return head;
                }
            }
        }
        return head;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
