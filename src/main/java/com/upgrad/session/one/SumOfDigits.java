package com.upgrad.session.one;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigitsSingle(int num) {
        int remainder = num%9;
        if(remainder == 0) {
            return 9;
        } else {
           return remainder;
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(sumOfDigitsSingle(n) + "\n" );
    }
}
