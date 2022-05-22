package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 970. Powerful Integers
 */

public class PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> result = new HashSet<>();
        for (int a = 0; Math.pow(x, a) < bound; a++) {
            for (int b = 0; Math.pow(x, a)  + Math.pow(y, b) <= bound; b++) {
                double r =  Math.pow(x, a)  + Math.pow(y, b);
                result.add((int) r);
                if(y == 1) {
                    break;
                }
            }
            if(x == 1){
                break;
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        System.out.println(new PowerfulIntegers().powerfulIntegers(1, 1, 10));
    }
}
