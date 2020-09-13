package com.imarkofu.leetcode.y2020.w36;

import java.util.LinkedList;
import java.util.List;

public class Demo0099 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Demo0099 d = new Demo0099();
        TreeNode root = d.new TreeNode(1);
        root.left = d.new TreeNode(3);
        root.left.right = d.new TreeNode(2);
        d.list(root, list);
        System.out.println(list);
        list.clear();
        d.recoverTree(root);
        d.list(root, list);
        System.out.println(list);
        list.clear();

        root = d.new TreeNode(3);
        root.left = d.new TreeNode(1);
        root.right = d.new TreeNode(4);
        root.right.left = d.new TreeNode(2);
        d.list(root, list);
        System.out.println(list);
        list.clear();
        d.recoverTree(root);
        d.list(root, list);
        System.out.println(list);
        list.clear();

    }

    public void recoverTree(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        list(root, list);
        swap(root, list, find(list));
    }

    private void swap(TreeNode root, List<Integer> list, int[][] p) {
        if (null != root) {
            swap(root.left, list, p);
            list.add(root.val);
            if (list.size() - 1 == p[0][0]) {
                root.val = p[1][1];
            } else if (list.size() - 1 == p[1][0]) {
                root.val = p[0][1];
                return ;
            }
            swap(root.right, list, p);
        }
    }

    private int[][] find(List<Integer> list) {
        int[][] p = new int[][]{{-1, -1},{-1, -1}};
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                if (p[0][0] == -1) {
                    p[0][0] = i - 1;
                    p[0][1] = list.get(i - 1);
                    p[1][0] = i;
                    p[1][1] = list.get(i);
                } else {
                    p[1][0] = i;
                    p[1][1] = list.get(i);
                    break;
                }
            }
        }
        list.clear();
        return p;
    }

    private void list(TreeNode root, List<Integer> list) {
        if (null != root) {
            list(root.left, list);
            list.add(root.val);
            list(root.right, list);
        }
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
