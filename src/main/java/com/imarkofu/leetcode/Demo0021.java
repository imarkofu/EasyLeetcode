package com.imarkofu.leetcode;

/**
 * 合并两个有序链表
 *
 * @author cglong
 * @version 20200420000
 * 创建Demo0021类
 */
public class Demo0021 {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        } else if (null == l2) {
            return l1;
        } else if (l1.val < l2.val) {
            return merge(l1, l2);
        } else {
            return merge(l2, l1);
        }
    }

    private ListNode merge(ListNode first, ListNode last) {
        ListNode ln = first;
        ListNode fln = ln;
        first = first.next;

        while (null != first && null != last) {
            if (first.val <= last.val) {
                ln.next = first;
                first = first.next;
            } else {
                ln.next = last;
                last = last.next;
            }
            ln = ln.next;
        }
        if (null != first) {
            ln.next = first;
        } else {
            ln.next = last;
        }
        return fln;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
