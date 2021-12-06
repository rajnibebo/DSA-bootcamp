package com.upgrad.session.one;

import java.util.Scanner;

public class GeneratePassword {

    public static void genPW(char[] arr, int length) {
        for (int i = 0 ; i < arr.length; i++) {
            helper(arr, "", (i+1), i, 0);
        }

    }

    public static  void newMethod(char[] array, int startIndex, int endIndex, int length) {
        if(length == endIndex) {
            for (int i = 0 ; i < endIndex; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = 0 ; i < array.length; i++) {
                newMethod(array, i, i+1, 1);
            }
        }
    }

    public static void helper(char[] array, String string, int requiredLength, int position, int count) {
        if(string.length() == requiredLength) {
            System.out.println(string);
            string = "";
        } else {
            for (int i = position; count < requiredLength; i++) {
                string += array[i];
                helper(array, string, requiredLength, position+1, count);
                //count++;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, 0);
    }
}
