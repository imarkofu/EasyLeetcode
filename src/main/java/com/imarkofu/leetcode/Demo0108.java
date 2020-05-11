package com.imarkofu.leetcode;

/**
 * 将有序数据转换为二叉搜索树
 *
 * @author cglong
 * @version 20200511000
 * 创建Demo0108类
 */
public class Demo0108 {

    public static void main(String[] args) {
        TreeNode root = new Demo0108().sortedArrayToBST(new int[]{-10,-3,0,5,9});
        System.out.println(root);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (null == nums) {
            return null;
        } else {
            return get(nums, 0, nums.length - 1);
        }
    }

    public TreeNode get(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else if (start == end) {
            return new TreeNode(nums[start]);
        } else {
            // int mid = (start + end) / 2;
            int mid = start + (end - start + 1) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = get(nums, start, mid - 1);
            root.right = get(nums, mid + 1, end);
            return root;
        }
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
