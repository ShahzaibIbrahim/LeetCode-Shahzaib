package com.leetcode.interviews.practice;

import java.util.*;

public class ComposeWordUsingPrecedence {

    public String composeWord(String [] precedence) {
        List<String> characterList = new ArrayList<>();
        for(int i=0; i<precedence.length; i++) {
            String [] splitStr = precedence[i].split(">");

            if(characterList.contains(splitStr[1])) {
                int index = characterList.indexOf(splitStr[1]);
                if (!characterList.contains(splitStr[0])) {
                    characterList.add(index, splitStr[0]);
                }
            } else {
                if (!characterList.contains(splitStr[0])) {
                    characterList.add(splitStr[0]);
                }
                characterList.add(splitStr[1]);
            }
        }

        return String.join("" , characterList);
    }

    public String findWord(String [] rules) {

      Map<String,String> nodes = new HashMap<>();
      List<String> endLetters = new ArrayList<>();
      List<String> startLetters = new ArrayList<>();

        for(int i = 0; i < rules.length; i++) {
            String [] splitVals = rules[i].split(">");
            startLetters.add(splitVals[0]);
            endLetters.add(splitVals[1]);
            nodes.put(splitVals[0],splitVals[1]);
        }


        // find the letter in starting letters which is not the end letter of anyone. // S
        String startLetter = startLetters.stream().filter(x-> !endLetters.contains(x)).findFirst().orElse(null);
        System.out.println(startLetter);

        String word = "";
        String currentLetter = startLetter;
        while (currentLetter!=null) {
            word += currentLetter;
            currentLetter = nodes.get(currentLetter);
        }

        return word;
    }

    public static void main(String[] args) {
        System.out.println(new ComposeWordUsingPrecedence().findWord(new String[]{"W>I", "R>L", "T>Z", "Z>E", "E>R", "L>A", "A>N", "N>D", "I>T", "S>W"}));
       // System.out.println(new ComposeWordUsingPrecedence().composeWord(new String[]{"I>N","A>I","P>A","S>P"}));
    }
}
