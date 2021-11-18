package com.upgrad.session.one;

import java.util.Arrays;
import java.util.Scanner;

public class GeneratePassword {

//    static void genPW(char[] arr, int n) {
//        genPW(arr, 0, n, 0);
//    }
//
//    static void genPW(char[] arr, int k, int n, int o) {
//        if(k == n) {
//            System.out.println(Arrays.toString(arr));
//        } else {
//            // need to modify this method to consider x, y, xx, yy, xy, yx combinations as well
//            for (int i = o; i < n ; i++) {
//                for (int j = k ; j < n ; j++) {
//                    char temp = arr[k];
//                    arr[k] = arr[i];
//                    arr[i] = temp;
//
//                    // char[] charArray = Arrays.copyOf(arr, i + 1);
//                    //System.out.println(arr[i]);
//                    genPW(arr, k+1, n, o+1);
//                    temp = arr[k];
//                    arr[k] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//
//        }
//    }

    static void genPW(char[] arr, int k, int n) {

        // to consider x, y, xx, yy combinations
        for (int i = k; i < n * n; i++) {
            if (i == n) {
                i = 0;
                while (n != i) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[i]);
                    }
                    System.out.println();
                    i++;
                }
                //k++;
            } else if (i < n) {
                System.out.println(arr[i]);
            }
        }

        // generate xy, yx combinations
        permutation(arr, k, n);

    }

    static void permutation(char[] arr, int k, int n) {
        if (k == n) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            for (int i = k; i < n; i++) {
                char temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                permutation(arr, k + 1, n);
                temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
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
        //System.out.println(Arrays.toString(arr));
        genPW(arr, 0, n);
    }
}
