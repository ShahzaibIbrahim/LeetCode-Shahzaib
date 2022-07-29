package com.leetcode.easy;


public class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for(String sentence : sentences) {
            int length = sentence.split(" ").length;
            if(length > maxWords) {
                maxWords = length;
            }
        }

        return maxWords;
    }

    public static void main(String[] args) {
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(new MostWordsFound().mostWordsFound(sentences));
    }
}
