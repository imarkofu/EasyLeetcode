package com.imarkofu.leetcode.y2020.w32;

public class Demo0074 {

    public static void main(String[] args) {
        int[][] tp = new int[][]{{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
        System.out.println(new Demo0074().searchMatrix(tp, 1));
        System.out.println(new Demo0074().searchMatrix(tp, 3));
        System.out.println(new Demo0074().searchMatrix(tp, 20));
        System.out.println(new Demo0074().searchMatrix(tp, 13));
        System.out.println(new Demo0074().searchMatrix(new int[0][0], 13));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (null == matrix || matrix.length <= 0 || matrix[0].length <= 0) {
            return false;
        }

        int start = 0, end = matrix.length - 1, middle = 0, tp = matrix[0].length - 1;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (matrix[middle][0] > target) {
                end = middle - 1;
            } else if (matrix[middle][tp] < target) {
                start = middle + 1;
            } else {
                break;
            }
        }
        if (start > end) {
            return false;
        }
        start = 0;
        end = tp;
        while (start <= end) {
            tp = start + (end - start) / 2;
            if (matrix[middle][tp] == target) {
                return true;
            } else if (matrix[middle][tp] > target) {
                end = tp - 1;
            } else {
                start = tp + 1;
            }
        }

        return false;
    }
}
