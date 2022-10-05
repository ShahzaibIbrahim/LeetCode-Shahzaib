package com.leetcode.easy;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1;
        int tail2 = n - 1;
        int combinedIndex = m + n - 1;

        while(tail1 >= 0 && tail2 >= 0) {
            nums1[combinedIndex--] = nums1[tail1] > nums2[tail2] ? nums1[tail1--] : nums2[tail2--];
        }

        while(tail2 >= 0) {
            nums1[combinedIndex--] = nums2[tail2--];
        }
    }

    public static void main(String[] args) {
     //   int[] nums1 = {1,2,3,0,0,0}; int m = 3; int [] nums2 = {2,5,6}; int n = 3;
        //   int[] nums1 = {1,2,4,5,6,0}; int m = 5; int [] nums2 = {3}; int n = 1;
        int[] nums1 = {0}; int m = 5; int [] nums2 = {3}; int n = 1;
      //  int[] nums1 = {1}; int m = 1; int [] nums2 = {}; int n = 0;

        new MergeSortedArrays().merge(nums1, m, nums2, n);
    }
}
