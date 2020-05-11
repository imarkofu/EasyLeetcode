package com.imarkofu.leetcode;

/**
 * 平衡二叉树
 *
 * @author cglong
 * @version 20200511000
 * 创建Demo0110类
 */
public class Demo0110 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new Demo0110().isBalanced(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        System.out.println(new Demo0110().isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {
        return check(root).balance;
    }

    public Tp check(TreeNode root) {
        if (null == root) {
            return new Tp(true, 0);
        }
        Tp left = check(root.left);
        if (left.balance) {
            Tp right = check(root.right);
            if (right.balance) {
                if (Math.abs(right.depth - left.depth) < 2) {
                    return new Tp(true, Math.max(left.depth, right.depth) + 1);
                } else {
                    return new Tp(false, 0);
                }
            } else {
                return new Tp(false, 0);
            }
        } else {
            return new Tp(false, 0);
        }
    }

    private static class Tp {
        private boolean balance;
        private int depth;
        public Tp(boolean balance, int depth) {
            this.balance = balance;
            this.depth = depth;
        }
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
