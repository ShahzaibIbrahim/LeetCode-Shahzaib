package com.leetcode.easy;

public class Tictactoe {

    public String tictactoe(int[][] moves) {
        int[][] row = new int[2][3];
        int[][] col = new int[2][3];
        int[][] diag = new int[2][2];

        for (int i = 0; i < moves.length; ++i) {
            int r = moves[i][0];
            int c = moves[i][1];
            int plyr = i % 2;

            row[plyr][r]++;
            col[plyr][c]++;
            if(r == c) diag[plyr][0]++;
            if(r + c == 2) diag[plyr][1]++;

            if (row[plyr][r] == 3 || col[plyr][c] == 3 || diag[plyr][0] == 3 || diag[plyr][1] == 3){
                return plyr == 0 ? "A" : "B";
            }
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }

    public static void main(String[] args) {
        int [][] moves= {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        System.out.println(new Tictactoe().tictactoe(moves));
    }


}
