package com.leetcode.interviews.remotebase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {

    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {
        // Write your code here
        List<Integer> qualifyingList = new ArrayList<>();

        for(Integer skill : skills) {
            if(skill >= minLevel && skill <= maxLevel) {
                qualifyingList.add(skill);
            }
        }

        List<String> combination = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> subList;
        for(int i=0; i<=qualifyingList.size(); i++) {
            for(int k=0; k<=qualifyingList.size(); k++) {

                if(i!=k) {
                    int biggerVal = k > i ? k : i;
                    int smallVal = i < k ? i : k;
                    subList = qualifyingList.subList(smallVal, biggerVal);

                   // if(!combination.contains(smallVal+"~"+biggerVal)) {
                        finalList.add(subList);
                        System.out.println(subList);
                        combination.add(smallVal + "~" + biggerVal);
                   // }

                }
            }
        }

        int returnCount = 0;
        for(int k=0; k<finalList.size(); k++) {
            if(finalList.get(k).size() >= minPlayers) {
                returnCount++;
            }
        }

        return returnCount;
    }
    public static void main(String[] args) {

        Integer [] arr= {12, 4, 6, 13, 5, 10};
        List<Integer> listarr = new ArrayList<>(Arrays.asList(arr));



        new Question2().countTeams(listarr,3 , 4, 10);
    }
}
