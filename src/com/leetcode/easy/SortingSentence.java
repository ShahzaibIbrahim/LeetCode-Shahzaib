package com.leetcode.easy;

public class SortingSentence {
    public String sortSentence(String s) {
        String [] words = s.split(" ");
        String [] resultArr = new String[words.length];

        for(String word : words) {
            int index = Integer.parseInt(String.valueOf(word.charAt(word.length() -1))) - 1;
            resultArr[index] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", resultArr);
    }

    public static void main(String[] args) {
        System.out.println(new SortingSentence().sortSentence("is2 sentence4 This1 a3"));
    }
}
