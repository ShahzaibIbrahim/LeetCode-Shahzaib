package com.leetcode.toptal;

public class QuestionOne {
    public String solution(String message, int K) {
        // write your code in Java SE 8

        // region Validations
        if(K > 500 || K <1) {
            return "";
        }

        if(message == null || message.length() < 1 || message.length() > 500) {
            return "";
        }

        if(K > message.length()) {
            return message;
        }

        String [] arrString = message.split(" ");

        int spaceCount = 0;
        for(int i=0; i<K; i++) {
            if(i+1 >= K) {
                spaceCount++;
            } else if(message.charAt(i+1) == ' ') {
                spaceCount++;
            }
        }

        StringBuilder finalString = new StringBuilder();
        for(int i=0; i<spaceCount; i++) {
            finalString.append(arrString[i]).append(" ");
        }

        if(finalString.charAt(finalString.length() -1) == ' ') {
            finalString.deleteCharAt(finalString.length() -1);
        }

        return finalString.toString();
    }


    public static void main(String[] args) {
     /*   System.out.println(new QuestionOne().solution("Codility We test coders", 14));
        System.out.println(new QuestionOne().solution("The quick brown fox jumps over the lazy dog", 39));
        System.out.println(new QuestionOne().solution("To crop or not to crop", 21));*/
        System.out.println(new QuestionOne().solution("Pollard", 7));
    }
}
