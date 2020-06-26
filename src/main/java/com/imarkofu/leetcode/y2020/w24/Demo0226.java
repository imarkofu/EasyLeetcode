package com.imarkofu.leetcode.y2020.w24;

public class Demo0226 {

    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }

    private void swap(TreeNode tn) {
        if (null != tn && (null != tn.left || null != tn.right)) {
            TreeNode tmp = tn.left;
            tn.left = tn.right;
            tn.right = tmp;
            swap(tn.left);
            swap(tn.right);
        }
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
