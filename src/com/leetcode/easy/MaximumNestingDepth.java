package com.leetcode.easy;

import java.util.Stack;

public class MaximumNestingDepth {
    public int maxDepth(String s) {
        int max = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if('('  == s.charAt(i)) {
                stack.push('(');
            } else if(')' == s.charAt(i)) {
                if(stack.size() > max) {
                    max = stack.size();
                }
                stack.pop();
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumNestingDepth().maxDepth("(1)+((2))+(((3)))"));
    }
}
