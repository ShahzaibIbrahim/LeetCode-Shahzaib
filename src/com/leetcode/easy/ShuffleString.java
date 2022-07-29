package com.leetcode.easy;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char [] result = new char[s.length()];

        for(int i=0; i<s.length(); i++) {
            int index = indices[i];
            result[index] = s.charAt(i);
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(new ShuffleString().restoreString(s, indices));
    }
}
