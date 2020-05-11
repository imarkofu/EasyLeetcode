package com.imarkofu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 杨辉三角
 *
 * @author cglong
 * @version 20200511000
 * 创建Demo0118类
 */
public class Demo0118 {

    public static void main(String[] args) {
        List<List<Integer>> list = new Demo0118().generate(9);
        for (List<Integer> integers : list) {
            System.out.println(integers);
        }
    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return Collections.emptyList();
        } else {
            List<List<Integer>> list = new ArrayList<>(numRows);
            list.add(Collections.singletonList(1));
            if (numRows >= 2) {
                list.add(Arrays.asList(1, 1));
            }
            for (int i = 3; i <= numRows; i++) {
                List<Integer> current = new ArrayList<>(i);
                int end = i / 2;
                boolean js = 1 == (i & 1);
                current.add(1);
                List<Integer> up = list.get(i - 2);
                for (int j = 1; j < i; j++) {
                    if (js) {
                        if (j <= end) {
                            current.add(up.get(j - 1) + up.get(j));
                        } else {
                            current.add(current.get(end - j + end));
                        }
                    } else {
                        if (j < end) {
                            current.add(up.get(j - 1) + up.get(j));
                        } else {
                            current.add(current.get(end - j + end - 1));
                        }
                    }
                }
                list.add(current);
            }
            return list;
        }
    }
}
