package com.imarkofu.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 杨辉三角Ⅱ
 *
 * @author cglong
 * @version 20200511000
 * 创建Demo0119类
 */
public class Demo0119 {

    public static void main(String[] args) {
        System.out.println(new Demo0119().getRow(3));
        System.out.println(new Demo0119().getRow(4));
        System.out.println(new Demo0119().getRow(5));
    }

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex <= 0) {
            return Collections.emptyList();
        } else if (1 == rowIndex) {
            return Collections.singletonList(1);
        } else if (2 == rowIndex) {
            return Arrays.asList(1, 1);
        } else {
            // List<Integer> list = new ArrayList<>(rowIndex);
            Integer[] list = new Integer[rowIndex];
            list[0] = 1;
            int i = 3, end = 0, j = 0;
            boolean js = false;
            for (; i <= rowIndex; i++) {
                end = i / 2;
                int last = list[end - 1];
                if (js = (1 == (i & 1))) {
                    list[end] = last * 2;
                }
                for (j = end - 1; j > 0; j--) {
                    list[j] = list[j] + list[j - 1];
                }
            }
            if (js) {
                for (j = end + 1; j < rowIndex; j++) {
                    list[j] = list[end - j + end];
                }
            } else {
                for (j = end; j < rowIndex; j++) {
                    list[j] = list[end - j + end - 1];
                }
            }
            return Arrays.asList(list);
        }
    }
}
