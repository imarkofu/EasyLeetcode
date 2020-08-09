package com.imarkofu.leetcode.y2020.w30;

public class Demo0404 {


    public int sumOfLeftLeaves(TreeNode root) {
        if (null != root) {
            if (null != root.left && null == root.left.right && null == root.left.left) {
                return root.left.val + sumOfLeftLeaves(root.right);
            } else {
                return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
            }
        } else {
            return 0;
        }
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
