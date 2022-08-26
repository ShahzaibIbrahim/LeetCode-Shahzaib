package com.leetcode.medium;

import java.util.*;

public class LongestPalindromicSubstring {

    // a, b, ab , bb
    // My First Solution
    public String longestPalindrome1(String s) {
        Set<String> subStrings = new HashSet();
        subStrings.add(s);

        for(int i=0; i<=s.length(); i++) {
            for(int j=i + 1; j<=s.length(); j++) {
                System.out.println(i + " | " + j + " = " + s.substring(i, j));
                subStrings.add(s.substring(i, j));
            }
        }
        subStrings.removeIf(x -> !x.equalsIgnoreCase(new StringBuilder(x).reverse().toString()));
        String result = subStrings.stream().max(Comparator.comparingInt(String::length)).get();
        return result;
    }

    // optimized Solution // still 0(n2)
    public String longestPalindrome2(String s) {
        int max = 0;
        String result = "";

        for(int i=0; i<=s.length(); i++) {
            for(int j=i + 1; j<=s.length(); j++) {
                String subStr = s.substring(i, j);

                if(subStr.equalsIgnoreCase(new StringBuilder(subStr).reverse().toString())) {
                    if(subStr.length() > max) {
                        max = subStr.length();
                        result = subStr;
                    }
                }
            }
        }
        return result;
    }

    private String longestString = "";
    private int maxLength = 0;

    // Third Solution. Inspired by leetcode. Done by myself.
    public String longestPalindrome(String s) {
        if(s.length() == 0) {
            return "";
        }

        for(int i=0; i<s.length(); i++) {
            // for odd
            findPalindrome(s, i, i);
            // for even
            findPalindrome(s, i, i + 1);
        }
        return longestString;
    }

    public void findPalindrome(String s, int leftIndex, int rightIndex) {
        if(s.length() > rightIndex && leftIndex>= 0) {
            if(s.charAt(leftIndex) == s.charAt(rightIndex)) {
               // System.out.println(s.substring(leftIndex, rightIndex + 1));
                String palindromeString = s.substring(leftIndex, rightIndex + 1);
                if(palindromeString.length() > maxLength) {
                    maxLength = palindromeString.length();
                    longestString = palindromeString;
                }
                leftIndex--;
                rightIndex++;
                findPalindrome(s, leftIndex, rightIndex);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("abb")); // bb
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad")); // bab or aba
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("maddam")); // maddam
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("ac")); // a or c
    }
}
