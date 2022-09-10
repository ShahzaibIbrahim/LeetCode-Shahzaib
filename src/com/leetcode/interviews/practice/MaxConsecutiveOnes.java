package com.leetcode.interviews.practice;

// Inefficient but great work in short time
public class MaxConsecutiveOnes {

    public int longestOnes(int[] nums, int k) {
        int max = 0;

        for(int i=0; i<nums.length; i++){
            int count = 0;
            int flips = 0;
            for(int j=i; j< nums.length; j++) {
                if(nums[j] == 1) {
                    count++;
                } else if(nums[j] == 0 && flips < k) {
                    count++;
                    flips++;
                } else {
                    break;
                }
            }
            max = Math.max(count, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int  k = 2;
        System.out.println(new MaxConsecutiveOnes().longestOnes(nums, k));
    }
}
