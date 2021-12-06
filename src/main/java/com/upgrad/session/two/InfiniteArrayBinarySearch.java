package com.upgrad.session.two;

import java.util.Scanner;

public class InfiniteArrayBinarySearch {
    static int binarySearch(int arr[], int low, int high, int key)
    {
        /* This function implements Binary Search */
        if (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                return binarySearch(arr, mid + 1, high, key);
            } else {
                return binarySearch(arr, low, mid - 1, key);
            }
        }
        return -1;
    }

    static int infiniteArray(int arr[], int key)
    {
        /* This function returns the position of the
           element (if found) or -1 (if not found) */
        int low = 0;
        int high = 0;
        int power = 1;
        while(true) {
            if(arr[high] < key) {
                low = high;
                high = power(2, ++power);
            } else {
                break;
            }

        }
        return binarySearch(arr, low, high, key);
    }

    public static int power(int number, int power) {
        int result = 1;
        for (int i = 1; i < power; i++) {
            result = result * number;
        }
        return result;
    }


    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int key;
        key = s.nextInt();

        System.out.println(infiniteArray( arr, key ) + "\n" );
    }
}
