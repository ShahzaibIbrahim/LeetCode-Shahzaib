package com.leetcode.interviews.practice;

/*
Find number of Circular primes up to 1000000
 */

public class CircularPrimes {

    public void circularPrimes(int n) {

        for(int i=2; i<n; i++) {
            if(circularPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public boolean circularPrime(int n) {
        int k = n; // 1234
        boolean circularPrime = true;
        int count = countNumbers(n);


        while(k>0) {
            int d = k / 10; // 123
            int r = k % 10; // 4

            int circularNumber = (r * (int) Math.pow(10, count - 1)) + d;
         //   System.out.println(circularNumber);
            k = circularNumber;

            if(!isPrime(k)) {
                circularPrime = false;
                break;
            }

            if(k == n) {
                break;
            }
        }

        return circularPrime;
    }

    public int countNumbers(int n) {
        int count = 0;

        while(n > 0) {
            count++;
            n = n/10;
        }

        return count;
    }

    public boolean isPrime(int n) {
        boolean isPrime = true;

        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }

    public static void main(String[] args) {
        new CircularPrimes().circularPrimes(100);
        // System.out.println(new CircularPrimes().isPrime(31));
     //   new CircularPrimes().circularPrime(1234);
    }
}
