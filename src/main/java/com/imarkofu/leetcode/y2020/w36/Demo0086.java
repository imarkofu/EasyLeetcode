package com.imarkofu.leetcode.y2020.w36;

public class Demo0086 {

    public static void main(String[] args) {
        Demo0086 d = new Demo0086();
        ListNode root = d.new ListNode(1);
        root.next = d.new ListNode(4);
        root.next.next = d.new ListNode(3);
        root.next.next.next = d.new ListNode(2);
        root.next.next.next.next = d.new ListNode(5);
        root.next.next.next.next.next = d.new ListNode(2);
        print(d.partition(root, 3));
    }

    private static void print(ListNode root) {
        while (null != root) {
            System.out.print(root.val + " => ");
            root = root.next;
        }
        System.out.println();
    }

    public ListNode partition(ListNode head, int x) {
        if (null == head || null == head.next) return head;
        ListNode lt = null, lth = null, ge = null, geh = null;
        while (null != head) {
            if (head.val < x) {
                if (null == lt) {
                    lt = head;
                    lth = lt;
                } else {
                    lt.next = head;
                    lt = lt.next;
                }
            } else {
                if (null == ge) {
                    ge = head;
                    geh = ge;
                } else {
                    ge.next = head;
                    ge = ge.next;
                }
            }
            head = head.next;
        }
        if (null != ge) {
            ge.next = null;
        }
        if (null == lth) {
            return geh;
        } else {
            lt.next = geh;
            return lth;
        }
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
