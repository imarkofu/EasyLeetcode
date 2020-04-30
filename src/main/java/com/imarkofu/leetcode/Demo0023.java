package com.imarkofu.leetcode;

/**
 * 合并k个排序链表
 *
 * @author cglong
 * @version 20200423000
 * 创建Demo0023类
 */
public class Demo0023 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (null == lists || lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        } else {
            int len = lists.length;
            while (len > 1) {
                int i = 0;
                for (; i < len / 2; i++) {
                    lists[i] = merge(lists[2 * i], lists[2 * i + 1]);
                }
                if ((len & 1) == 1) {
                    lists[i] = lists[len ++ - 1];
                }

                len = len / 2;
            }
            return lists[0];
        }
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cursor = head;

        while (null != l1 && null != l2) {
            if (l1.val <= l2.val) {
                cursor.next = l1;
                l1 = l1.next;
            } else {
                cursor.next = l2;
                l2 = l2.next;
            }
            cursor = cursor.next;
        }
        if (null != l1) {
            cursor.next = l1;
        } else if (null != l2) {
            cursor.next = l2;
        }
        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode l = new Demo0023().mergeKLists(new ListNode[]{l1, l2, l3});
        while (null != l) {
            System.out.println(l.val);
            l = l.next;
        }
    }
}
