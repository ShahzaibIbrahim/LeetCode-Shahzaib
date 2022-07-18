package com.leetcode.easy;

public class IsPalindrome {


    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        int i=0, j=s.length()-1;

        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) {
                //System.out.println(s.charAt(i) + "|" + s.charAt(j));
                isPalindrome= false;
                break;
            }
            i++; j--;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {

        System.out.println(new IsPalindrome().isPalindrome("race a car"));
        System.out.println(new IsPalindrome().isPalindrome(" "));
        System.out.println(new IsPalindrome().isPalindrome("A man, a plan, a canal: Panama"));

    }
}
