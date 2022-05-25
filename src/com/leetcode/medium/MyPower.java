package com.leetcode.medium;

import com.leetcode.easy.TransposeMatrix;

/**
 * 50. Pow(x, n)
 */

public class MyPower {

    public double myPow(double x, int n) {
        if(x == 0) {
            return 0;
        }
        if(n == 0) {
            return 1.0;
        }

        if(n < 0) {
            return n % 2 == 0? myPow(1/x * 1/x, -(n/2)) : 1/x * myPow(1/x * 1/x, -(n/2));
        }

        return n % 2 ==0 ? myPow(x*x, n/2) : x * myPow(x*x, n/2);
    }

    public static void main(String[] args) {
        System.out.println(new MyPower().myPow(2.10, 3));
        System.out.println(new MyPower().myPow(2.00, 10));
        System.out.println(new MyPower().myPow(2, -2));

    }
}
