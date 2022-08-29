package com.leetcode.interviews.practice;

import java.util.Arrays;

public class VendingMachine {

    public int [] minimumCoins(double total, double spent) {
        int [] coins = {100, 50, 25, 10, 5, 1};
        int [] result = {0, 0, 0, 0, 0, 0};

        int returnValue = (int) ((total * 100)  - (spent*100));
        int i = 0;

        while(returnValue > 0 && i < coins.length) {
            if(returnValue - coins[i] >= 0) {
                returnValue = returnValue - coins[i];
                result[coins.length - i  - 1]++;
            } else {
                i++;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new VendingMachine().minimumCoins(5.00, 3.67)));
    }
}
