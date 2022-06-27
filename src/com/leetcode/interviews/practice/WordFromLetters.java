package com.leetcode.interviews.practice;

import java.util.ArrayList;
import java.util.List;

public class WordFromLetters {

    public String solution(String [] arr) {
        String result = "";
        List<String> resultList = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            String [] splitVal = arr[i].split(">");

            if(resultList.contains(splitVal[1])) {
                int index = resultList.indexOf(splitVal[1]);
                resultList.add(index, splitVal[0]);
            } else {
                resultList.add(splitVal[0]);
                resultList.add(splitVal[1]);
            }
        }

        return resultList.toString();
    }

    public static void main(String[] args) {
        String arr[] = {"I>N", "A>I", "P>A", "S>P"};
        System.out.println(new WordFromLetters().solution(arr));
    }
}
