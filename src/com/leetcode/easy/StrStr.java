package com.leetcode.easy;

public class StrStr {

    public int strStr(String haystack, String needle) {
        int result = -1;

        for(int i=0; i<=haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i + needle.length()).equalsIgnoreCase(needle)) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("a", "a"));
    }
}
