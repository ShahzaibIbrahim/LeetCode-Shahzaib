package com.leetcode.easy;

public class BalancedStrings {

    public int balancedStringSplit(String s) {
        int result = 0;
        int balance = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'L') {
                balance++;
            } else {
                balance --;
            }

            if(balance == 0) {
                result++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(new BalancedStrings().balancedStringSplit("RLRRRLLRLL")); // 2
        System.out.println(new BalancedStrings().balancedStringSplit("RLRRLLRLRL")); // 4
    }
}
