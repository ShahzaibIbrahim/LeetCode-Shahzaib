package com.leetcode.easy;

public class Sqrt {

    public int mySqrt(int x) {
        if(x==0)
            return 0;

        int res = 2;

        while((double) res*res <= x) {
            res++;
        }
        return res- 1;
    }

    public static void main(String[] args) {
        System.out.println(new Sqrt().mySqrt(2147395600));
    }

    /*
            // Max step 4
        1 1 1 1
        1 1 2
        2 1 1
        1 2 1
        // 5

        1 1 1 1 1
        1 1 1 2
        1 1 2 1

     */
}
