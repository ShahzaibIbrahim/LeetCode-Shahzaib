package com.leetcode.medium;

import java.util.Arrays;

public class MinimumMoves {
    public int minMoves2(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int middle=nums[nums.length/2];


        for(int i=0; i<nums.length; i++) {
            int res = Math.abs(middle - nums[i]);
            count += res;
        }

        return count;
    }

    public static void main(String[] args) {
        int [] nums = {1,10,2,9};
       // int [] nums = {1,0,0,8,6};
        System.out.println(new MinimumMoves().minMoves2(nums));
    }
}
