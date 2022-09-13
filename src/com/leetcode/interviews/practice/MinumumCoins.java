package com.leetcode.interviews.practice;

import java.util.Arrays;

public class MinumumCoins {

    static int minCoins(int coins[], int total)
    {
        // base case
        if (total == 0) return 0;

        // Initialize result
        int res = Integer.MAX_VALUE;

        // Try every coin that has smaller value than V
        for (int i=0; i<coins.length; i++)
        {
            if (coins[i] <= total)
            {
                int sub_res = minCoins(coins, total-coins[i]);

                // Check for INT_MAX to avoid overflow and see if
                // result can minimized
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }

    /*

9 6 5 1 - 11

9 1 1 - 3
6 5 - 2
5 1 1 1 1 1 1 - 11
     */


    public int myCoinChange(int [] coins, int value) {

        if(value == 0) {
            return 0;
        }

        int result = Integer.MAX_VALUE;

        for(int i=0; i<coins.length; i++) {
            if(coins[i] <= value) {

                int subResult = myCoinChange(coins, value - coins[i]);

                if(subResult!= Integer.MAX_VALUE && subResult + 1 < result) {
                    result = subResult + 1;
                }

            }
        }

        return result;
    }
    public static void main(String args[])
    {
        int coins[] =  {9, 6, 5, 1};
        int V = 11;
        System.out.println("Minimum coins required is "+ new MinumumCoins().myCoinChange(coins, V) );
    }
}
