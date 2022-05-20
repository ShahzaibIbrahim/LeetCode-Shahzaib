package com.leetcode.easy;

import java.util.*;

/*
13. Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger {


    public int romanToInt(String s) {
        int result = 0;

        Map<String, Integer> romanValueMap = new HashMap<>();
        romanValueMap.put("I", 1);
        romanValueMap.put("IV", 4);
        romanValueMap.put("IX", 9);
        romanValueMap.put("V", 5);
        romanValueMap.put("X", 10);
        romanValueMap.put("XL", 40);
        romanValueMap.put("XC", 90);
        romanValueMap.put("L", 50);
        romanValueMap.put("C", 100);
        romanValueMap.put("CD", 400);
        romanValueMap.put("CM", 900);
        romanValueMap.put("D", 500);
        romanValueMap.put("M", 1000);

        for(int i=0; i<s.length(); i++) {
            String c;

            if(i+2<=s.length() && romanValueMap.containsKey(s.substring(i, i+2))) {
                c = s.substring(i, i+2);
                i++;
            } else {
                c = String.valueOf(s.charAt(i));
            }
            result += romanValueMap.get(c);
        }



        return result;
    }

    public int romanToInt2(String s) {
        int result = 0;

        Map<Character, Integer> romanValueMap = new HashMap<>();
        romanValueMap.put('I', 1);
        romanValueMap.put('V', 5);
        romanValueMap.put('X', 10);
        romanValueMap.put('L', 50);
        romanValueMap.put('C', 100);
        romanValueMap.put('D', 500);
        romanValueMap.put('M', 1000);

        result = romanValueMap.get(s.charAt(s.length() - 1));
        for(int i=0; i<s.length()- 1; i++) {
            if(romanValueMap.get(s.charAt(i)) >=  romanValueMap.get(s.charAt(i + 1))) { // M > C -> C
                result += romanValueMap.get(s.charAt(i));
            } else {
                result -= romanValueMap.get(s.charAt(i));
            }
        }

        return result;
    }



    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("MCMXCIV", "LVIII", "III"); // ,

        RomanToInteger romanToInteger = new RomanToInteger();
        inputList.stream().forEach(x -> System.out.println(romanToInteger.romanToInt2(x)));
    }
}

