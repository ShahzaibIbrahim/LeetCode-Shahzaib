package com.leetcode.easy;

public class StringArraysEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    public static void main(String[] args) {

        /*String [] arr1 = {"ab", "c"};
        String [] arr2 = {"a", "bc"};*/
        String [] arr1 = {"abc", "d", "defg"};
        String [] arr2 = {"abcddefg"};
        System.out.println(new StringArraysEquivalent().arrayStringsAreEqual(arr1, arr2));
    }
}
