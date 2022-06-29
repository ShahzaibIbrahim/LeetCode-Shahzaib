package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] resultarr = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (found) {
                break;
            }
            for (int k = i + 1; k < nums.length; k++) {
                int sum = nums[i] + nums[k];
                if (sum == target) {
                    resultarr[0] = i;
                    resultarr[1] = k;
                    found = true;
                    break;
                }
            }
        }
        return resultarr;
    }

    public int[] twoSumA(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        System.out.println(Arrays.toString(new TwoSum().twoSumA(arr, 6)));
    }
}
