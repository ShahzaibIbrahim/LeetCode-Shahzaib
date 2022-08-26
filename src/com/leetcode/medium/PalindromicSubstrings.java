package com.leetcode.medium;

public class PalindromicSubstrings {


    public int countSubstrings(String s) {

        int count =0;
        for(int i=0; i< s.length(); i++) {
            count += countPalindrome(s, i, i+1) + countPalindrome(s, i, i);
        }

        return count;
    }

    public int countPalindrome(String s, int leftIndex, int rightIndex) {
        if(leftIndex>=0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
            System.out.print(s.substring(leftIndex, rightIndex + 1) + " | ");
            return 1 + countPalindrome(s, leftIndex- 1, rightIndex+ 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromicSubstrings().countSubstrings("aaa"));
        System.out.println(new PalindromicSubstrings().countSubstrings("abc"));
        System.out.println(new PalindromicSubstrings().countSubstrings("maddam"));
        System.out.println(new PalindromicSubstrings().countSubstrings("abb"));
    }
}
