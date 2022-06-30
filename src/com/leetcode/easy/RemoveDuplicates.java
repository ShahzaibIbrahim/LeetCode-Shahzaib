package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        Integer prev = null;

        for(int i=0; i<nums.length; i++) {
            if(prev== null || prev != nums[i]) {
                nums[count] = nums[i];
                count++;
            }
            prev = nums[i];
        }

        return count;
    }

    public static void main(String[] args) {
        //int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int [] nums = {-1,0,0,0,0,3,3};
        new RemoveDuplicates().removeDuplicates(nums);
    }
}
