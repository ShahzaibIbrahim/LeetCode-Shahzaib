package com.leetcode.medium;

import java.util.Arrays;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // -2
        int maxSoFar = nums[0]; // -2

        for(int i=1; i<nums.length;++i) {
            System.out.println((maxSoFar + "+" + nums[i] + " OR " + nums[i]));
            maxSoFar = Math.max(maxSoFar + nums[i], nums[i]);
            maxSum = Math.max(maxSoFar, maxSum);
        }


        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumSubArray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}