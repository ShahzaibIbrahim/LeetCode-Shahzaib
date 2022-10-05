package com.leetcode.easy;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import com.sun.org.apache.bcel.internal.generic.DCONST;
import com.sun.org.apache.bcel.internal.generic.FCONST;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        boolean containsDuplicate = false;
        HashSet<Integer> visitedNumbers = new HashSet<>();

        for(int i=0; i< nums.length; i++) {
            if(!visitedNumbers.contains(nums[i])) {
                visitedNumbers.add(nums[i]);
            } else {
                containsDuplicate = true;
                break;
            }
        }

        return containsDuplicate;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,4}));
    }
}
