package com.leetcode.easy;

import java.util.Arrays;

public class KeepMultiplyTwo {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);

        for(int i=0;i <nums.length; i++) {
            if(nums[i] == original) {
                original *= 2;
            }
        }

        return original;
    }

    public static void main(String[] args) {
        int [] arr = {5,3,6,1,12}; int original = 3;
        System.out.println(new KeepMultiplyTwo().findFinalValue(arr, original));
    }
}
