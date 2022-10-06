package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArray {

    public int[] intersect(int[] nums1, int[] nums2) {
        int [] result = new int[Math.min(nums1.length, nums2.length)];
        int resCount = 0;
        Map<Integer, Integer> nums1Map = new HashMap<>(); // number and index

        for(int i=0; i<nums1.length; i++) {
            if(nums1Map.containsKey(nums1[i])) {
                nums1Map.put(nums1[i], nums1Map.getOrDefault(nums1[i], 0) + 1);
            } else {
                nums1Map.put(nums1[i], 1);
            }
        }

        for(int k=0; k<nums2.length; k++) {
            if(nums1Map.containsKey(nums2[k]) && nums1Map.get(nums2[k]) > 0) {
                result[resCount++] = nums2[k];
                nums1Map.put(nums2[k], nums1Map.getOrDefault(nums2[k], 0) - 1);
            }
        }

        return Arrays.copyOf(result, resCount);
    }


    public static void main(String[] args) {
        System.out.println(new IntersectionOfTwoArray().intersect(new int[]{4 , 9 , 5 }, new int[]{9, 4, 9, 8, 4}));
    }
}