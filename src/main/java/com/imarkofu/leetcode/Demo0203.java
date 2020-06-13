package com.imarkofu.leetcode;

/**
 * 移除链表元素
 *
 * @author cglong
 * @version 20200612000
 * 创建Demo0203类
 */
public class Demo0203 {

    public static void main(String[] args) {
        Demo0203 d = new Demo0203();
        ListNode first = d.new ListNode(1);
        first.next = d.new ListNode(2);
        first.next.next = d.new ListNode(6);
        first.next.next.next = d.new ListNode(3);
        first.next.next.next.next = d.new ListNode(4);
        first.next.next.next.next.next = d.new ListNode(5);
        first.next.next.next.next.next.next = d.new ListNode(6);

        first = d.removeElements(first, 6);
        while (null != first) {
            System.out.println(first.val);
            first = first.next;
        }

        System.out.println("===========");
        first = d.new ListNode(3);
        first.next = d.new ListNode(3);
        first.next.next = d.new ListNode(3);
        first.next.next.next = d.new ListNode(4);
        first.next.next.next.next = d.new ListNode(5);
        first.next.next.next.next.next = d.new ListNode(3);
        first.next.next.next.next.next.next = d.new ListNode(6);

        first = d.removeElements(first, 3);
        while (null != first) {
            System.out.println(first.val);
            first = first.next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode ln = new ListNode(0);
        ln.next = head;
        ListNode pp = ln;
        while (null != head) {
            if (head.val == val) {
                ln.next = head.next;
            } else {
                ln = head;
            }
            head = head.next;
        }

        return pp.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
