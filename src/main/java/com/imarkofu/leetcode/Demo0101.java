package com.imarkofu.leetcode;

public class Demo0101 {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(2);
        t.left.left = new TreeNode(3);
        t.left.right = new TreeNode(4);
        t.right.left = new TreeNode(4);
        t.right.right = new TreeNode(3);

        t.left.left.left = new TreeNode(3);
        t.left.left.right = new TreeNode(4);

        t.right.right.left = new TreeNode(4);
        t.right.right.right = new TreeNode(3);

        System.out.println(new Demo0101().isSymmetric(t));
    }

    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        } else {
            return isSymmetric(root.left, root.right);
        }
    }

    public boolean isSymmetric(TreeNode l, TreeNode r) {
        if (null == l && null == r) {
            return true;
        } else if (null != l && null != r && l.val == r.val) {
            return isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
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
