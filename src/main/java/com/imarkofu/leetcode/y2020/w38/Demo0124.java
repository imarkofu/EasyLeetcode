package com.imarkofu.leetcode.y2020.w38;

public class Demo0124 {

    public static void main(String[] args) {
        Demo0124 d = new Demo0124();
        TreeNode root = d.new TreeNode(1);
        root.left = d.new TreeNode(2);
        root.right = d.new TreeNode(3);
        System.out.println(d.maxPathSum(root));

        root = d.new TreeNode(-10);
        root.left = d.new TreeNode(9);
        root.right = d.new TreeNode(20);
        root.right.left = d.new TreeNode(15);
        root.right.right = d.new TreeNode(7);
        System.out.println(d.maxPathSum(root));
    }

    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // if (null == root) return 0;
        depth(root);
        return max;
    }

    private int depth(TreeNode root) {
        if (null == root) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        int t = root.val;
        if (left > 0) {
            t += left;
        }
        if (right > 0) {
            t += right;
        }
        max = Math.max(t, max);
        return root.val + (Math.max(0, Math.max(left, right)));
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
