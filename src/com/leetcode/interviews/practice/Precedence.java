package com.leetcode.interviews.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Precedence {

    Map<Character, Integer> precedenceMap = new HashMap<>();


    public void sortWords(String [] words, String order) {

        for(int i=0; i<order.length(); i++) {
            precedenceMap.put(order.charAt(i) , i);
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                for(int j=0; j < Math.min(o1.length(), o2.length()); j++) {
                    if(precedenceMap.get(o1.charAt(j)) != precedenceMap.get(o2.charAt(j))) {
                        return precedenceMap.get(o1.charAt(j)) - precedenceMap.get(o2.charAt(j));
                    }
                }

                return (o1.length() - o2.length());
            }
        });

        for(String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {

        String[] words = {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";

        new Precedence().sortWords(words, order);
    }
}
