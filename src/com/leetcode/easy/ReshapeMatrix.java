package com.leetcode.easy;

public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] result = new int[r][c];

        if(r*c != mat.length*mat[0].length) {
            return mat;
        }

        int k=0; int l=0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
              //  System.out.println(mat[i][j]);
                if(l == c) {
                    l=0;
                    k++;
                }
                result[k][l] = mat[i][j];
                l++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
       // new ReshapeMatrix().matrixReshape(new int[][] {{1,2},{3,4}}, 1, 4);
        new ReshapeMatrix().matrixReshape(new int[][] {{1,2},{3,4}}, 2,  4);
    }
}
