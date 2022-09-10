package com.leetcode.interviews.practice;

public class AmicablePairs {

    public int sumOfDivisor(int val) {
        int sum = 1;
        int i =2;
        while(i< Math.sqrt(val)) {
            if(val%i == 0) {
                sum += i;
              //  System.out.println("rs = " + i);
                if (val / i != i) {
                    sum += val / i;
                //    System.out.println("rs = " + val / i);
                }
            }
            i++;
        }

       // System.out.println("Sum = " + sum);
        return sum;
    }
    public boolean isAmicable(int a, int b) {
        return (sumOfDivisor(a) == b && sumOfDivisor(b) == a);
    }

    public void countPairs(int [] arr, int size) {
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                boolean isAmicable = isAmicable(arr[i], arr[j]);
                if(isAmicable) {
                    System.out.println(arr[i] + "|" + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 220, 284, 1184,
                1210, 2, 5 };
        int n1 = arr1.length;

        new AmicablePairs().countPairs(arr1, n1);

       // new AmicablePairs().sumOfDivisor(220);
       /* int arr2[] = { 2620, 2924, 5020,
                5564, 6232, 6368 };
        int n2 = arr2.length;
        new AmicablePairs().countPairs(arr2, n2);*/
    }
}
