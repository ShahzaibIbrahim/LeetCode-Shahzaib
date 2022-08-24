package com.leetcode.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

// Copied Code For better time complexity.
public class MedianFinder2 {

    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large = new PriorityQueue<>();
    private boolean even = true;

    public double findMedian() {
        if (even)
            return (small.peek() + large.peek()) / 2.0;
        else
            return small.peek();
    }

    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }


    public static void main(String[] args) {
        MedianFinder2 medianFinder = new MedianFinder2();
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
