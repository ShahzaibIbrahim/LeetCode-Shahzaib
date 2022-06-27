package com.leetcode.interviews.toptal;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QuestionThree {

    public int solution(int[] A) {
        // write your code in Java SE 8
        //  33

        int sum = IntStream.of(A).sum();
        int result = sum;
        int halfCount = 0;
        while(result > sum/2) {
            Arrays.sort(A);
            int largestValue = A[A.length - 1]; // 19
            int halfOfLargest = largestValue/2; // 9
            halfCount++;
            A[A.length - 1] = halfOfLargest;
            result =  IntStream.of(A).sum();
        }

        return halfCount;
    }

    public static void main(String[] args) {
        int [] arr1 = {10 , 10}; // 20 - 10/2 = 5/2 = 2.5 10/2 == 20 -- 19 / 8 / 5 / 2 = 34 / 17  - 9 / 8 / 5 / 2
        System.out.println(new QuestionThree().solution(arr1));
    }
}
