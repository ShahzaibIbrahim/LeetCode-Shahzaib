package com.leetcode.interviews.practice;

// How many ways to seperate a string "abaccadd" in to 3 strings so that each of them contain same amount of "a"s

public class SameAmountOfAs {

    char characterToFind = 'a';
    public void sameAmountOfAs(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            for(int j=i; j<str.length(); j++) {
                String a = str.substring(0, i);
                String b = str.substring(i, j);
                String c = str.substring(j);

                if(countCharacters(a, characterToFind) == countCharacters(b, characterToFind) && countCharacters(b, characterToFind) == countCharacters(c, characterToFind)) {
                    System.out.println(a + " | " + b + " | " + c);
                    count++;
                }
            }
        }

        System.out.println(count);

    }

    public int countCharacters(String s, char a) {
        int count=0;

        for(int i=0; i<s.length(); i++) {
            if(a == s.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        new SameAmountOfAs().sameAmountOfAs("aabacacadda");
    }
}
