package com.imarkofu.leetcode.y2020.w37;

public class Demo0538 {

    public static void main(String[] args) {
        Demo0538 d = new Demo0538();
        TreeNode root = d.new TreeNode(5);
        root.left = d.new TreeNode(2);
        root.right = d.new TreeNode(13);
        d.print(d.convertBST(root));
        System.out.println();

        root = d.new TreeNode(1);
        root.left = d.new TreeNode(2);
        root.right = d.new TreeNode(3);
        root.left.left = d.new TreeNode(4);
        root.left.right = d.new TreeNode(5);
        root.right.left = d.new TreeNode(6);
        root.right.left = d.new TreeNode(7);
        root.left.left.left = d.new TreeNode(8);

        d.print(d.convertBST(root));
        System.out.println();
    }

    private void print(TreeNode root) {
        if (null != root) {
            print(root.left);
            System.out.print(root.val + " => ");
            print(root.right);
        }
    }

    public TreeNode convertBST(TreeNode root) {
        fan(root, 0);
        return root;
    }

    private int fan(TreeNode root, int pre) {
        if (null != root) {
            root.val = root.val + fan(root.right, pre);
            return fan(root.left, root.val);
        }
        return pre;
    }


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
