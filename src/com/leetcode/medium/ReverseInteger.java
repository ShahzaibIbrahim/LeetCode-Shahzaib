package com.leetcode.medium;

public class ReverseInteger {

    /*
        123

        s1 pick last value -> 3
        s2 new Value 1*0 + 3 = 3 // multivalue * resultValue + remainder
        s3 current Value 12
        s4 multivalue * 10
        s1 -> 2
        s2 -> 10*3 + 2 = 32

        s1 -> 1
        s2 -> 100*32 + 1 = 320 + 1 = 321

     */

    public int reverse(int x) {
        int returnVal = 0;
        boolean isNegative = x < 0;
        x= Math.abs(x);
        // 123
        while(x > 0) {
            if(Integer.MAX_VALUE / 10 < returnVal) return 0;
            int remainder = x%10;
            returnVal = (10 * returnVal) + remainder;
            x = x/10;
        }

        return isNegative? (-1* returnVal) : returnVal;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));
    }
}
