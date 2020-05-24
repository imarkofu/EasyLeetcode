package com.imarkofu.leetcode;

public class Demo0160 {

    public static void main(String[] args) {
        ListNode ha = new ListNode(4);
        ha.next = new ListNode(1);
        ha.next.next = new ListNode(8);
        ha.next.next.next = new ListNode(4);
        ha.next.next.next.next = new ListNode(5);

        ListNode hb = new ListNode(5);
        hb.next = new ListNode(0);
        hb.next.next = new ListNode(1);
        hb.next.next.next = ha.next.next;

        System.out.println(new Demo0160().getIntersectionNode(ha, hb).val);

        ha = new ListNode(2);
        ha.next = new ListNode(4);
        ha.next.next = new ListNode(6);
        hb = new ListNode(1);
        hb.next = new ListNode(5);
        System.out.println(new Demo0160().getIntersectionNode(ha, hb));
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = null == a ? headB : a.next;
            b = null == b ? headA : b.next;
        }
        return a;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
