package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class DoubleOfN {

    public boolean checkIfExist(int[] arr) {
        boolean result = false;

        Set uniqueNumbers = new HashSet();
        for(int i=0; i<arr.length; i++) {
            if(uniqueNumbers.contains(arr[i] * 2) || (arr[i]%2==0 && uniqueNumbers.contains(arr[i] / 2))) {
                return true;
            }
            uniqueNumbers.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {7,1,14,11};
        int [] arr2 = {3,1,7,11};
        int [] arr3 = {-2,0,10,-19,4,6,-8};
        int [] arr4 = {0, 0};
        System.out.println(new DoubleOfN().checkIfExist(arr4));
    }
}
