package com.imarkofu.leetcode;

/**
 * 删除链表的倒数第N个节点
 *
 * @author cglong
 * @version 20200421000
 * 创建Demo0019类
 */
public class Demo0019 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode ln = new Demo0019().removeNthFromEnd(head, 4);
        while (null != ln) {
            System.out.println(ln.val);
            ln = ln.next;
        }

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n > 0) {
            int length = tp(head, 0, n);
            if (length == n) {
                return head.next;
            }
        }
        return head;
    }
    public int tp(ListNode currentNode, int curLength, int n) {
        if (null == currentNode) {
            return curLength;
        } else {
            int length = tp(currentNode.next, curLength + 1, n);
            if (length - curLength - 1 == n) {
                currentNode.next = currentNode.next.next;
            }

            return length;
        }
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
