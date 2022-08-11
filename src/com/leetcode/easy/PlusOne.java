package com.leetcode.easy;

import java.util.Arrays;

public class PlusOne {
        // 3 9
        // 3 10
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;

        for(int i=digits.length -1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }


        int [] res = new int[digits.length + 1];
        res[0] = 1;

        return res;
    }


    public static void main(String[] args) {
        int [] arr = {9,9,9,9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(arr)));
    }
}
