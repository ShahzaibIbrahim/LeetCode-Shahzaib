package com.leetcode.easy;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        for(int i=0; i<jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            for(int j=0; j<stones.length(); j++) {
                if(jewel == stones.charAt(j)) {
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(new JewelsAndStones().numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(new JewelsAndStones().numJewelsInStones("z", "ZZ"));
    }
}
