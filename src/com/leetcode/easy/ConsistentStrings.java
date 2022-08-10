package com.leetcode.easy;

public class ConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;

        for(int i=0; i<words.length; i++) {
            boolean isConsistent = true;
            for(int j = 0; j < words[i].length(); j++) {
                if(!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ConsistentStrings().countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }
}
