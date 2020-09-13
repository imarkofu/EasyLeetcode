package com.imarkofu.leetcode.y2020.w36;

import java.util.Arrays;

public class Demo0501 {

    public static void main(String[] args) {
        TreeNode root = new Demo0501().new TreeNode(1);
        root.left = new Demo0501().new TreeNode(1);
        root.right = new Demo0501().new TreeNode(2);
        root.right.left = new Demo0501().new TreeNode(2);
        System.out.println(Arrays.toString(new Demo0501().findMode(root)));
    }

    private TreeNode pre = null;
    private int cur = 0;
    private int max = 0;
    private int same = 0;
    private int[] res = null;

    public int[] findMode(TreeNode root) {
        if (null == root) return new int[0];
        deal(root);
        res = new int[same];
        same = 0;
        cur = 0;
        pre = null;
        deal(root);
        return res;
    }

    private void deal(TreeNode root) {
        if (null == root) return ;
        deal(root.left);
        cur = (null != pre && pre.val == root.val) ? cur + 1 : 1;
        if (cur > max) {
            max = cur;
            same = 1;
        } else if (cur == max) {
            if (null != res)
                res[same] = root.val;
            same ++;
        }
        pre = root;
        deal(root.right);
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
