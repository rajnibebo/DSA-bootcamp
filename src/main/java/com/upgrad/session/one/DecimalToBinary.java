package com.upgrad.session.one;

import java.util.Scanner;

public class DecimalToBinary {
    static int decToBin(int n)
    {
       if(n == 0) {
           return 0;
       } else {
           return n%2 + 10 * decToBin(n/2);
       }
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(decToBin(n) + "\n" );
    }

}
