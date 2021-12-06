package com.upgrad.session.one;

import java.util.Scanner;

public class RecursiveGCD {
    static int gcd(int x, int y)
    {
        int gcd = 1;
        //Write code here
        int range = x > y ? x : y;
        for (int i = 2; i < range/2; i++) {
            if(x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    static int recursiveGcd(int x, int y)
    {
       if( y == 0) {
           return x;
       } else {
           return recursiveGcd(y , x%y);
       }

    }

    public static void main(String args[])
    {
        int x, y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();

        System.out.println(recursiveGcd(x, y) + "\n" );
    }
}
