package com.imarkofu.leetcode.y2020.w23;

public class Demo0065 {

    public static void main(String[] args) {
        System.out.println(new Demo0065().isNumber("123") == true);
        System.out.println(new Demo0065().isNumber(" 123") == true);
        System.out.println(new Demo0065().isNumber("0") == true);
        System.out.println(new Demo0065().isNumber("0123") == true);
        System.out.println(new Demo0065().isNumber("-10") == true);
        System.out.println(new Demo0065().isNumber("12.3") == true);
        System.out.println(new Demo0065().isNumber(".3") == true);
        System.out.println(new Demo0065().isNumber("0.") == true);
        System.out.println(new Demo0065().isNumber("+.9") == true);
        System.out.println(new Demo0065().isNumber("1.0e4.5") == false);
        System.out.println(new Demo0065().isNumber("123 4") == false);
        System.out.println(new Demo0065().isNumber("1a3") == false);
        System.out.println(new Demo0065().isNumber("") == false);
        System.out.println(new Demo0065().isNumber("          ") == false);
        System.out.println(new Demo0065().isNumber(null) == false);
    }

    public boolean isNumber(String s) {
        if (null == s) return false;
        s = s.trim();
        boolean existPoint = false;
        boolean existE = false;
        boolean existNum = false;
        boolean eNextNumber = true;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                existNum = true;
                eNextNumber = true;
            } else if (ch == '.') {
                if (existPoint || existE) {
                    return false;
                }
                existPoint = true;
            } else if (ch == '-' || ch == '+') {
                if (i != 0 && s.charAt(i - 1) != 'e') {
                    return false;
                }
            } else if (ch == 'e') {
                if (existE || !existNum) {
                    return false;
                }
                existE = true;
                eNextNumber = false;
            } else {
                return false;
            }
        }

        return eNextNumber && existNum;
    }
}
