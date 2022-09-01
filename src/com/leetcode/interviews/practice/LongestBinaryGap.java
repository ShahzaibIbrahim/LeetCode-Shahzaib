package com.leetcode.interviews.practice;

public class LongestBinaryGap {

    public int longestBinaryGap(int x) {
        int result =0;
        int zeroCount = 0;
        while(x > 0) {
            int remainder = x % 2;
            x= x/2;
            System.out.print(remainder);

            if(remainder==0) {
                zeroCount++;
                result = Math.max(result, zeroCount);
            } else {
                zeroCount = 0;
            }
        }


        return result;
    }

    public int longestBinaryGap2(int x) {
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

    public static void main(String[] args) {
        System.out.println(new LongestBinaryGap().longestBinaryGap2(1041));
    }
}
