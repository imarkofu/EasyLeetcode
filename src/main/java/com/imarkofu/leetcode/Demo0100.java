package com.imarkofu.leetcode;

public class Demo0100 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println(new Demo0100().isSameTree(p, q));

        p = new TreeNode(1);
        p.left = new TreeNode(2);

        q = new TreeNode(1);
        q.right = new TreeNode(2);
        System.out.println(new Demo0100().isSameTree(p, q));

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null == q) {
            return true;
        } else if (null != p && null != q && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }

    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
