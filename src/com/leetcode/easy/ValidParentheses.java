package com.leetcode.easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }

            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if(stack.isEmpty()) {
                    result = false;
                    break;
                }
                char popChar = stack.pop();

                if((popChar == '(' && s.charAt(i) == ')') || (popChar == '[' && s.charAt(i) == ']') || (popChar == '{' && s.charAt(i) == '}')  ) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        if(!stack.isEmpty() && result) {
            result = false;
        }

        return result;
    }

    public boolean isValidCopiedSolution(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        String s1 = "(]";
        String s2 = "()";
        String s3 = "[()]";
        String s4 = "{[]}";
        String s5 = "{}]";
        String s6 = "({}){";
        System.out.println(new ValidParentheses().isValid(s6));
    }
}
