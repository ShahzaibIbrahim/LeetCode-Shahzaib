package com.leetcode.easy;

import java.util.Arrays;

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int totalSum = Arrays.stream(nums).sum();

        for(int i=0; i< nums.length; i++) {
            if(leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new PivotIndex().pivotIndex(new int[]{1,7,3,6,5,6})); // 3
        System.out.println(new PivotIndex().pivotIndex(new int[] {1,2,3})); // -1
        System.out.println(new PivotIndex().pivotIndex(new int[] {2,1,-1})); // 0
    }
}
