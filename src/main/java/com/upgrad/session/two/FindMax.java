package com.upgrad.session.two;

import java.util.Scanner;

public class FindMax {
    static int max(int arr[], int low, int high)
    {
        //Write code here
        int mid = (low + high)/2;
        if(mid < arr.length - 1) {
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]) {
                return max(arr, low, mid);
            } else if(arr[mid] < arr[mid+1] && arr[mid] > arr[mid-1]) {
                return max(arr, mid, high);
            }
        }
        return -1;


    }

    public static void main (String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(max(arr, 0, n-1));
    }
}
