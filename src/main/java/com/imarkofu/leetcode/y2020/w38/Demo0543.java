package com.imarkofu.leetcode.y2020.w38;

public class Demo0543 {

    public static void main(String[] args) {
        Demo0543 d = new Demo0543();
        TreeNode root = d.new TreeNode(1);
        root.left = d.new TreeNode(2);
        root.right = d.new TreeNode(3);
        root.left.left = d.new TreeNode(4);
        root.left.right = d.new TreeNode(5);
        System.out.println(d.diameterOfBinaryTree(root));
    }
    private int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if (null == root || (null == root.left && null == root.right)) return 0;
        depth(root);
        return max;
    }

    private int depth(TreeNode root) {
        if (null == root) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
