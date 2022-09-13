package com.leetcode.medium;

public class CountPrimes {

    public int countPrimes(int n) {
        int count =0;
        boolean [] notPrime = new boolean[n];


        for(int i=2; i<n; i++) {
            if(notPrime[i] == false) {
                count++;

                for(int j=2; j*i < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }

    public int countPrimes1(int n) {
        int count =0;

        for(int i=2; i<n; i++) {
            if(isPrime(i)) {
                count++;
            }
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
        System.out.println(new CountPrimes().countPrimes(0)); // 0
        System.out.println(new CountPrimes().countPrimes(1)); // 0
        System.out.println(new CountPrimes().countPrimes(10)); // 4
    }
}
