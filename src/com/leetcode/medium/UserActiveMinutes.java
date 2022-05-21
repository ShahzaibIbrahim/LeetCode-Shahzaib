package com.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1817. Finding the Users Active Minutes
 */

public class UserActiveMinutes {

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int [] resultArray = new int[k];
        HashMap<Integer, Set<Integer>> minutesMap = new HashMap<>();

        for(int i=0; i<logs.length; i++) {
            int id = logs[i][0];
            int time = logs[i][1];

            if(!minutesMap.containsKey(id)) {
                minutesMap.put(id, new HashSet<>());
            }
            minutesMap.get(id).add(time);
        }
        for (Map.Entry<Integer, Set<Integer>> entry : minutesMap.entrySet()) {
            resultArray[entry.getValue().size() - 1]++;
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[][] input = {{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}};
        int[][] input1 = {{1,1},{2,2},{2,3}};

        new UserActiveMinutes().findingUsersActiveMinutes(input1, 4);
    }
}
