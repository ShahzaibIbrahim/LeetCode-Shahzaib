package com.leetcode.interviews.systems;

public class AnagramsSystems {

    public static int solution(String s) {
        int result = 0;
        // KKKK
        // KAAKB
        int k= s.length();
        int lengthofAnagram = 1;
        // 0 1 - 0 2 0 3
        for(int i=0; i<s.length(); i++) {
            for (int j= i + 1; j<= s.length(); j++) {
                System.out.print(s.substring(i,j) + " - ");
            }
        }


/*

        for(int i= 0; i< s.length() - lengthofAnagram; i++) {
            String subStr = s.substring(i, i +  lengthofAnagram);
            // K

            for(int j=i+1; j < s.length() - lengthofAnagram; j++) {
                // K A - K A - K K
                String reverseSubStr = s.substring(j , j + lengthofAnagram );
                // K
                System.out.println(subStr + "|" + reverseSubStr);
                if(subStr.equalsIgnoreCase(reverseSubStr)) {
                    result++;
                }
            }
            lengthofAnagram++;
        }
*/


        return result;
    }
    public static void main(String[] args) {

        ///here are 6 anagrams of the form k -> k at positions [[0], [1]] , [[0], [2]] , [[0], [3]] , [[1], [2]] , [[1], [3]]
        //[[2], [3]]
        AnagramsSystems.solution("KKKK");
    }
}
