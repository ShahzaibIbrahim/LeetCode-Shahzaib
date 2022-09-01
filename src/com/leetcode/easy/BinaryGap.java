package com.leetcode.easy;

public class BinaryGap {

    public int binaryGap(int x) {
        int result=0;

        String binaryVal = Integer.toBinaryString(x);

        int indexOfOne = binaryVal.indexOf("1");
        for(int i=0; i<binaryVal.length(); i++) {
            if(binaryVal.charAt(i) == '1') {
                result = Math.max(result, i - indexOfOne);
                indexOfOne = i;
            }
        }

        return result;
    }


}
