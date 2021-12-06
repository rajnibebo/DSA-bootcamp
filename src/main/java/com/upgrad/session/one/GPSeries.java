package com.upgrad.session.one;

import java.util.Scanner;
// Java implementation to
// illustrate the program
import java.io.*;
public class GPSeries {
    static long SumGPUtil(long r, long n,
                          long m)
    {

        // Base cases
        if (n == 0)
            return 1;
        if (n == 1)
            return (1 + r) % m;

        long ans;

        // If n is odd
        if (n % 2 == 1)
        {
            ans = (1 + r) *
                    SumGPUtil((r * r) % m,
                            (n - 1) / 2, m);
        }
        else
        {
            // If n is even
            ans = 1 + (r * (1 + r) *
                    SumGPUtil((r * r) % m,
                            (n / 2) - 1, m));
        }

        return (ans % m);
    }

    // Function to prlong the value of Sum
    static void SumGP(long a, long r,
                      long N, long M)
    {
        long answer;
        answer = a * SumGPUtil(r, N, M);
        answer = answer % M;

        System.out.println(answer);
    }

    // Driver Code
    public static void main (String[] args)
    {

        // First element
        long a = 2;

        // Common difference
        long r = 2;

        // Number of elements
        long N = 100;

        // Mod value
        long M = 10000;

        SumGP(a, r, N, M);
    }
}
