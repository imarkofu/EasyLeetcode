package com.imarkofu.leetcode.y2020.w36;

public class Demo0507 {

    public static void main(String[] args) {
        System.out.println(new Demo0507().checkPerfectNumber(1));
        System.out.println(new Demo0507().checkPerfectNumber(27));
        System.out.println(new Demo0507().checkPerfectNumber(28));
    }

    public boolean checkPerfectNumber(int num) {
        if (num <= 0) return false;
        int sum = 0, end = (int) Math.sqrt(num), result;
        for (int i = 1; i <= end; i++) {
            if (num % i == 0) {
                sum += i;
                result = num / i;
                if (i != result) {
                    sum += result;
                }
            }
        }
        return sum - num == num;
    }
    public boolean checkPerfectNumber2(int num) {
        int[] nums = new int[]{2,3,5,7,13,17,19,31};
        for (int n : nums) if (((1 << (n - 1)) * ((1 << n) - 1)) == num) return true;
        return false;
    }
}
