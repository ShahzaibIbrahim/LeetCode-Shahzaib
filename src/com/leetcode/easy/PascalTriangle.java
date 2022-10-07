package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            result.add(i, new ArrayList<>());
            for(int j=0; j<=i;j++) {
                if(j == i || j == 0) { // if its first or last element
                    result.get(i).add(1);
                } else {
                    result.get(i).add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new PascalTriangle().generate(5);
    }

}
