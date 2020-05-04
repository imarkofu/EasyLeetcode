package com.imarkofu.leetcode;

import java.util.*;

public class Demo0107 {

    public static void main(String[] args) {
        TreeNode tn = new TreeNode(3);
        tn.left = new TreeNode(9);
        tn.right = new TreeNode(20);
        tn.right.left = new TreeNode(15);
        tn.right.right = new TreeNode(7);
        System.out.println(new Demo0107().levelOrderBottom(tn));
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (null != root) {
            list.add(0, Collections.singletonList(root.val));
            List<TreeNode> ns = new ArrayList<>(2);
            if (null != root.left) {
                ns.add(root.left);
            }
            if (null != root.right) {
                ns.add(root.right);
            }
            TreeNode tn;
            while (!ns.isEmpty()) {
                List<TreeNode> ns2 = new ArrayList<>(ns.size() * 2);
                List<Integer> values = new ArrayList<>(ns.size());
                for (TreeNode n : ns) {
                    values.add(n.val);
                    if (null != n.left) {
                        ns2.add(n.left);
                    }
                    if (null != n.right) {
                        ns2.add(n.right);
                    }
                }
                ns = ns2;
                list.add(0, values);
            }
        }
        return list;
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
