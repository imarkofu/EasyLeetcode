package com.imarkofu.leetcode.y2020.w24;

import java.util.LinkedList;
import java.util.List;

public class Demo0257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        if (null != root) {
            if (null == root.left && null == root.right) {
                list.add("" + root.val);
            } else {
                String sb = "" + root.val;
                todo(root.left, sb, list);
                todo(root.right, sb, list);
            }
        }
        return list;
    }

    private void todo(TreeNode tn, String sb, List<String> list) {
        if (null != tn) {
            sb += ("->" + tn.val);
            if (null == tn.left && null == tn.right) {
                list.add(sb);
            } else {
                todo(tn.left, sb, list);
                todo(tn.right, sb, list);
            }
        }
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
