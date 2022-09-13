package com.leetcode.interviews.practice;

import java.util.Arrays;

public class LongestChain {


    public int findLongestChain(int[][] pairs)
    {
        Arrays.sort(pairs, (p1, p2)->p1[1]-p2[1]);

        int count = 0, end = Integer.MIN_VALUE;
        for (int[] pair : pairs)
        {
            if (pair[0] > end)
            {
                count++;
                end = pair[1];
                System.out.println(pair[0] + " | " + pair[1]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new LongestChain().findLongestChain(new int[][]{{1,2},{2,3},{3,4}}));
    }
}
