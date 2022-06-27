package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int anagramLength = p.length();

        for (int i = 0; i < s.length(); i++) {
            if ((i + anagramLength) <= s.length()) {
              //  System.out.println("i + anagramLength <= s.length(): " + (i + anagramLength)+ ": "+s.length());
                String subString = s.substring(i, i + anagramLength);
                System.out.println(subString + " | " + p);
                if (subString.equalsIgnoreCase(p) || sortString(subString).equalsIgnoreCase(sortString(p))) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    public String sortString(String s) {
        char[] ar = s.toCharArray();
        Arrays.sort(ar);
        String sorted = String.valueOf(ar);

        return sorted;
    }

    public static void main(String[] args) {
        System.out.println(new Anagrams().findAnagrams("cbaebabacd", "abc"));
       // System.out.println(new Anagrams().findAnagrams("beeaaedcbc", "c"));
    }
}
