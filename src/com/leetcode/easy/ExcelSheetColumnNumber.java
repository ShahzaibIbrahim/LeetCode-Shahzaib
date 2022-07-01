package com.leetcode.easy;

public class ExcelSheetColumnNumber {

    /*   ZY -> (26^1 * 26) + (26^0 * 25)
        zy -> (26^1 *LETTER) + (26^0 *LETTER)
*/
    public int titleToNumber(String columnTitle) {
        int power = 0;
        int result =0;
        for(int i=columnTitle.length() - 1; i >= 0; i--) {
           int position = (int) columnTitle.charAt(i) - 64; // Finding letter position via ascii code.
            result = (int) (result + (Math.pow(26, power) * position));  //   ZY -> (26^1 * 26) + (26^0 * 25)
            power++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("ZY"));
    }
}
