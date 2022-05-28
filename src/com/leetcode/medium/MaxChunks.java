package com.leetcode.medium;

public class MaxChunks {

    public int maxChunksToSorted(int[] arr) {
        int maxNum =0;
        int result =0;
        for(int i=0; i< arr.length; i++) {
            maxNum = Math.max(maxNum, arr[i]);

            if(maxNum == i) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []arr = {4,3,2,1,0};

        System.out.println(new MaxChunks().maxChunksToSorted(arr));
    }
}
