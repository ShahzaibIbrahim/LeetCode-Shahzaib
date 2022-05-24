package com.leetcode.easy;

import com.leetcode.medium.PowerfulIntegers;

/**
 * 867. Transpose Matrix
 */

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int [][] result = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++) { // 0/0, 0/1, 0/2
            for(int k=0; k< matrix[i].length; k++) {
                result[k][i] = matrix[i][k];
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[][] input1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] input2 = {{1,2,3},{4,5,6}};

        System.out.println(new TransposeMatrix().transpose(input2));
    }


}
