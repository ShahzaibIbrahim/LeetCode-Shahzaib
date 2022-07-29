package com.leetcode.easy;

public class ValueOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;

        for(String operation : operations) {
            if(operation.contains("++")) {
                x++;
            } else if(operation.contains("--")) {
                x--;
            }
        }

        return x;
    }

    public static void main(String[] args) {

        String [] operations = {"--X","X++","X++"};
        System.out.println(new ValueOperations().finalValueAfterOperations(operations));
    }
}
