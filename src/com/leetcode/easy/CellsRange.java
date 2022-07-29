package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class CellsRange {
    public List<String> cellsInRange(String s) {
        List<String> resultList = new ArrayList<>();
        String [] cells = s.split(":");
        char cellFromColumn = cells[0].charAt(0);
        int cellFromRow = Integer.parseInt(String.valueOf(cells[0].charAt(1)));

        char cellToColumn = cells[1].charAt(0);
        int cellToRow = Integer.parseInt(String.valueOf(cells[1].charAt(1)));


        for (int j = cellFromColumn; j <= cellToColumn; j++) {
            for (int i = cellFromRow; i <= cellToRow; i++) {
                String resultStr = "";
                char c = (char) j;
                resultStr += c;
                resultStr += i;
                resultList.add(resultStr);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(new CellsRange().cellsInRange("K1:L2"));
    }
}
