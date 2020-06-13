package com.imarkofu.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 快乐数
 *
 * @author cglong
 * @version 20200612000
 * 创建Demo0202类
 */
public class Demo0202 {

    public static void main(String[] args) {
        System.out.println(new Demo0202().isHappy(19));
        System.out.println(new Demo0202().isHappy(116));
        System.out.println(new Demo0202().isHappy(7));
        System.out.println(new Demo0202().isHappy(4));
    }

    int[] tp = new int[]{0, 1, 4, 9, 16, 25, 36, 49, 64, 81};
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (!set.add(n)) {
                return false;
            } else {
                n = getNext(n);
            }
        }
        return true;
    }

    public int getNext(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int total = 0;
            while (n > 0) {
                total += tp[n % 10];
                n /= 10;
            }
            return total;
        }
    }
}
