package com.leetcode.interviews.practice;

public class NoOfCarries {

    public int countCarries(int A, int B) {
        int result = 0;
        int carry = 0;
        while(A > 0 && B > 0) {
            System.out.println(A + " | " + B);
            int a = A % 10;
            int b = B % 10;

            int sum = a + b + carry;
            System.out.println(a + "+" + b + "=" + sum);

            if(sum> 9) {
                result++;
                carry = 1;
            } else {
                carry = 0;
            }

            A = A/10; B = B/10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result= " + new NoOfCarries().countCarries(5255, 2795));
    }
}
