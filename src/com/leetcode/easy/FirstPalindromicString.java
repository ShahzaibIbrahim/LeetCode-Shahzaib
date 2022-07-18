package com.leetcode.easy;

public class FirstPalindromicString {

    public String firstPalindrome(String[] words) {
        String result = "";

        for(int i=0;i <words.length; i++) {
            if(words[i].equalsIgnoreCase(new StringBuilder(words[i]).reverse().toString())) {
                result = words[i];
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String []words = {"abc","car","ada","racecar","cool"};
        String []words1 = {"def","ghi"};
        System.out.println(new FirstPalindromicString().firstPalindrome(words1));
    }
}
