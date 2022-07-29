package com.leetcode.easy;

public class GoalParserInterpretation {

    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        System.out.println(new GoalParserInterpretation().interpret("G()(al)"));
        System.out.println(new GoalParserInterpretation().interpret("G()()()()(al)"));
    }
}
