package com.imarkofu.leetcode.y2020.w36;

public class Demo0082 {

    public static void main(String[] args) {
        Demo0082 d = new Demo0082();
        ListNode root = d.new ListNode(1);
        root.next = d.new ListNode(2);
        root.next.next = d.new ListNode(3);
        root.next.next.next = d.new ListNode(3);
        root.next.next.next.next = d.new ListNode(4);
        root.next.next.next.next.next = d.new ListNode(4);
        root.next.next.next.next.next.next = d.new ListNode(5);
        print(d.deleteDuplicates(root));

        root = d.new ListNode(1);
        root.next = d.new ListNode(1);
        root.next.next = d.new ListNode(1);
        root.next.next.next = d.new ListNode(3);
        root.next.next.next.next = d.new ListNode(4);
        root.next.next.next.next.next = d.new ListNode(4);
        root.next.next.next.next.next.next = d.new ListNode(5);
        print(d.deleteDuplicates(root));
    }

    private static void print(ListNode root) {
        while (null != root) {
            System.out.print(root.val + " => ");
            root = root.next;
        }
        System.out.println();
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (null == head || head.next == null) return head;
        ListNode p = head;
        // 去除头部重复元素
        while (p != null && p.next != null && p.val == p.next.val) {
            // 找到所有同值节点
            while (true) {
                p = p.next;
                if (null == p.next || p.val != p.next.val) {
                    p = p.next;
                    break;
                }
            }
        }
        head = p;
        ListNode next;
        while (null != p && null != p.next) {
            next = p.next;
            if (null != next.next && next.val == next.next.val) {
                // 找到下一个不重复的元素
                do {
                    while (true) {
                        next = next.next;
                        if (null == next.next || next.val != next.next.val) {
                            next = next.next;
                            break;
                        }
                    }
                } while (null != next && null != next.next && next.val == next.next.val);
                p.next = next;
            } else {
                p = next;
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
