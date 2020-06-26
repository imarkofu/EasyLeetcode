package com.imarkofu.leetcode.y2020.w24;

public class Demo0234 {

    public boolean isPalindrome(ListNode head) {
        if (null == head) {
            return true;
        } else if (null == head.next) {
            return true;
        } else {
            // 快慢指针找到中间点
            ListNode fast = head, slow = head;
            while (null != fast.next && null != fast.next.next) {
                fast = fast.next.next;
                slow = slow.next;
            }
            // 开始反转后半部分
            slow = slow.next;
            ListNode ln2 = slow;
            slow = slow.next;
            ln2.next = null;
            while (null != slow) {
                ListNode t = slow;
                slow = slow.next;
                t.next = ln2;
                ln2 = t;
            }

            // 遍历
            while (null != ln2) {
                if (ln2.val != head.val) {
                    return false;
                }
                ln2 = ln2.next;
                head = head.next;
            }
            return true;
        }
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
