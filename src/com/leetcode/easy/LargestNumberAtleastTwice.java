package com.leetcode.easy;

import java.util.Arrays;

public class LargestNumberAtleastTwice {

    public int dominantIndex(int[] nums) {

        if(nums.length == 0) {
            return -1;
        }

        int highestVal =0;
        int secondHighestVal =0;
        int highestIndex = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > highestVal) {
                secondHighestVal = highestVal;
                highestVal = nums[i];
                highestIndex= i;
            }else if(nums[i]> secondHighestVal) {
                secondHighestVal = nums[i];
            }
        }

        if(highestVal >= secondHighestVal*2) {
            return highestIndex;
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1};
        System.out.println(new LargestNumberAtleastTwice().dominantIndex(arr));
    }
}
