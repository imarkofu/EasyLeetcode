package com.imarkofu.leetcode.y2020.w37;

public class Demo0530 {


    public static void main(String[] args) {
        Demo0530 d = new Demo0530();
        TreeNode root = d.new TreeNode(1);
        root.right = d.new TreeNode(3);
        root.right.left = d.new TreeNode(2);
        System.out.println(d.getMinimumDifference(root));
    }

    private boolean contain = false;
    private int pre;
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        mid(root);
        return min;
    }

    public void mid(TreeNode root) {
        if (null != root) {
            mid(root.left);
            if (!contain) {
                contain = true;
            } else {
                min = Math.min(min, Math.abs(root.val - pre));
            }
            pre = root.val;
            mid(root.right);
        }
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
