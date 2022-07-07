package com.leetcode.interviews.remotebase;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Learning how get subsets

public class Question1 {

    public void solution() {
        int n =3;
        System.out.println(1<<n);
    }

    static void printSubsets(char set[])
    {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++)

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");

            System.out.println("}");
        }
    }

    static void mySubset(String [] arr) {

       // int totalSize= (int) Math.pow(2, set.length);

        int limit = (int) Math.pow (2, arr.length); //calculating the number of subsets
        for (int i = 0; i < limit; i++)
        {
            //convert i to binary and use 0's and 1's
            //to check if an array's element is to be printed or not
            List<String> subSet = new ArrayList<>();
            // we make use of set to print in required order
            int temp = i;
            // we store i because we need to use value
            // of i without manipulating the actual i
            // as i is the outer loop iterator
            for (int j = arr.length - 1; j >= 0; --j)
            {
                //calculating the binary, extracting //
                // the remainder one and by one
                // and putting required element
                // in the String to be printed.
                int rem = temp % 2;
                temp = temp / 2;
                System.out.println(i + " - rem - "+rem+ " - val - "+temp);
                if (rem != 0)
                {                    // we print the element, so we add it to our answer string
                    subSet.add(arr[j]);
                }
            }
            System.out.println(String.join(",", subSet));
            // printing the required pattern line-by-line
        }


    }

    public static void main(String[] args) {
        String set[] = {"a", "b", "c"};
        //printSubsets(set);
        mySubset(set);
      //  System.out.println(subset.toString());
        //new Question1().solution();
    }
}
