package com.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> characterSet = new HashSet<>();
        int count = 0;
        for(int k=0; k<s.length(); k++) {
            count = 0;
            characterSet = new HashSet<>();
            for (int i = k; i < s.length(); i++) {
                if (!characterSet.contains(s.charAt(i))) {
                    count++;
                    characterSet.add(s.charAt(i));
                } else if (count > max) {
                    max = count;
                    i--;
                    count = 0;
                    characterSet = new HashSet<>();
                }
            }
        }

        return count > max ? count : max;
    }

    public int lengthOfLongestSubstringA(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("bwf")); //3
    /*    System.out.println(new LongestSubstring().lengthOfLongestSubstring("jbpnbwwd")); //5
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("dvdf")); //3
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("aab")); //2
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("pwwkew"));// 3
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("abcabcbb")); //3*/
    }
}
