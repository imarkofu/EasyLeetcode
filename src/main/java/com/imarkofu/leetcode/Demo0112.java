package com.imarkofu.leetcode;

/**
 * 路径总和
 *
 * @author cglong
 * @version 20200511000
 * 创建Demo0112类
 */
public class Demo0112 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(new Demo0112().hasPathSum(root, 22));
        System.out.println(new Demo0112().hasPathSum(null, 0));
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(new Demo0112().hasPathSum(root, 1));

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        } else {
            int r = sum - root.val;
            if (null == root.left && null == root.right) {
                return 0 == r;
            } else {
                return hasPathSum(root.left, r) || hasPathSum(root.right, r);
            }
        }
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
