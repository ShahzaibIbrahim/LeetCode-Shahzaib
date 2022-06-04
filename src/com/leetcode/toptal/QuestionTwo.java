package com.leetcode.toptal;

import java.util.*;

public class QuestionTwo {

    // Algo
    /*
        P[i
     */

    public int solution(int[] P, int[] S) {
        // write your code in Java SE 8

        int totalSeatSpace= 0;
        int totalPassenger = 0;
        int totalCars = P.length;
        List<Integer> sortedSeatArray = new ArrayList<>(); // using arraylist for sorting

        for(int i=0; i<totalCars; i++) {
            totalSeatSpace += S[i];
            totalPassenger += P[i];
            sortedSeatArray.add(S[i]);
        }

        if(totalSeatSpace < totalPassenger) {
            return totalCars; // since all of them will be used
        }

        Collections.sort(sortedSeatArray, Collections.reverseOrder());


        int carsUsed = 0;
        for(int i=0; i<totalCars; i++) {
            if(totalPassenger - sortedSeatArray.get(i) > 0 ) {
                totalPassenger -= sortedSeatArray.get(i);
                carsUsed++;
            } else {
                carsUsed++;
                return carsUsed;
            }
        }
        return carsUsed;
    }


    public static void main(String[] args) {

        int [] arr1 = {4, 4, 2, 4};
        int [] arr2 = {5, 5, 2, 5};

        System.out.println(new QuestionTwo().solution(arr1, arr2));
    }
}
