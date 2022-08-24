package com.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

public class MedianFinder {

    List<Integer> medianList;

    public MedianFinder() {
        medianList = new ArrayList<>();
    }

    public void addNum(int num) {
        int index = 0;
        while(index < medianList.size() && num>=medianList.get(index)) {
            index++;
        }
        medianList.add(index, num);
    }

    public double findMedian() {
        int middleElement = medianList.size() / 2;
        if(medianList.size() % 2 == 0) {
            return (medianList.get(middleElement - 1) + medianList.get(middleElement)) / 2.0;
        } else {
            return medianList.get(middleElement);
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
     //   System.out.println(medianFinder.findMedian());
        medianFinder.addNum(6);    // arr = [1]
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(10);    // arr = [1, 2]
        System.out.println(medianFinder.findMedian()); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(2);    // arr[1, 2, 3]
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(6);    // arr[1, 2, 3]
        System.out.println(medianFinder.findMedian()); // return 2.0
    }
}
