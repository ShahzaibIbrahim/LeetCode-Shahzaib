package com.leetcode.easy;

public class ClimbingStairs {

    public int climbStairsR(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0 || n == 1) {
            return 1;
        }

        return (climbStairsR(n - 1) + climbStairsR(n - 2));
    }

    public int climbStairs(int n) {
        if(n == 0)
            return 1;

        int [] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<=n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(2));
    }

    /*
     5
     1 1 1 1 1
     2 1 1 1
     1 2 1 1
     1 1 2 1
     1 1 1 2
     2 2 1

     */
}
