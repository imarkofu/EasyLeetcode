package com.imarkofu.leetcode.y2020.w38;

public class Demo0551 {
    public static void main(String[] args) {
        System.out.println(new Demo0551().checkRecord("PPALLP"));
        System.out.println(new Demo0551().checkRecord("PPALLL"));
        System.out.println(new Demo0551().checkRecord(""));
    }

    public boolean checkRecord(String s) {
        if (null == s || s.isEmpty()) return true;
        int ac = 0;
        int ml = 0;
        int lc = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                    ac ++;
                    if (lc > ml) {
                        ml = lc;
                    }
                    lc = 0;
                    break;
                case 'L':
                    lc ++;
                    break;
                case 'P':
                    if (lc > ml) {
                        ml = lc;
                    }
                    lc = 0;
                    break;
            }
        }
        return ac <= 1 && Math.max(ml, lc) <= 2;
    }
}
