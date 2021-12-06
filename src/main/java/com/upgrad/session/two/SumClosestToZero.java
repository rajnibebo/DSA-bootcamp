package com.upgrad.session.two;

import java.util.Arrays;
import java.util.Scanner;

public class SumClosestToZero {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);
        int minSum = arr[0] + arr[1];
        int arg1 = arr[0];
        int arg2 = arr[1];
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if(Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    arg1 = i;
                    arg2 = j;
                }
            }
        }
        System.out.println(arr[arg1] +" "+ arr[arg2]);
    }
}
