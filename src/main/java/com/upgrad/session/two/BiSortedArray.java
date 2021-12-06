package com.upgrad.session.two;

import java.util.Arrays;
import java.util.Scanner;

public class BiSortedArray {
    static void sortIncDec(int arr[], int n)
    {
        //Write code here
        int evenIndex = -1;
        int length = arr.length - 1;
        if(length % 2 == 0) {
            // array is of odd size.
            evenIndex = length;
        } else {
            evenIndex = length - 1;
        }
        // index : 0 1 2 3 4 5
        // Actual: 6 7 3 8 5 4
        // Expected : 6 3 5 7 8 4
        // output : 4 5 8 3 7 6
        int[] evenArray = new int[length/2 + 1];
        int[] oddArray = new int[length/2 + 1];

        int otherIndex = 0;
        System.out.println("Array : "+Arrays.toString(arr));
        for (int i = 0 ; i < arr.length - 1; i+=2) {
            evenArray[otherIndex] = arr[i];
            oddArray[otherIndex] = arr[i+1];
            otherIndex++;
        }
        System.out.println(Arrays.toString(evenArray));
        System.out.println("=====================");
        System.out.println(Arrays.toString(oddArray));

        // sort teh first half in increasing order
        mergeSortIncreasingOrder(evenArray, 0, evenArray.length- 1);
        mergeSortDecreasingOrder(oddArray, 0, oddArray.length-1);

        System.out.println(Arrays.toString(evenArray));
        System.out.println("=============");
        System.out.println(Arrays.toString(oddArray));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    static void mergeSortDecreasingOrder(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start + end)/2;
            mergeDecreasingOrder(arr, start, mid, end);
            mergeSortDecreasingOrder(arr, start, mid);
            mergeSortDecreasingOrder(arr, mid+1, end);
        }
    }

    static void mergeDecreasingOrder(int[] array, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int k = 0;

        int[] temp = new int[array.length];

        while (left <= mid && right <= end) {
            if(array[left] >= array[right]) {
                temp[k++] = array[left++];
            } else {
                temp[k++] = array[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = array[left++];
        }
        while (right <= end) {
            temp[k++] = array[right++];
        }

        left = start;
        k = 0;
        while (left <= end) {
            array[left++] = temp[k++];
        }
    }

    static void mergeSortIncreasingOrder(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start + end)/2;
            mergeIncreasingOrder(arr, start, mid, end);
            mergeSortIncreasingOrder(arr, start, mid);
            mergeSortIncreasingOrder(arr, mid+1, end);
        }
    }

    static void mergeIncreasingOrder(int[] array, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int k = 0;

        int[] temp = new int[array.length];

        while (left <= mid && right <= end) {
            if(array[left] <= array[right]) {
                temp[k++] = array[left++];
            } else {
                temp[k++] = array[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = array[left++];
        }
        while (right <= end) {
            temp[k++] = array[right++];
        }

        left = start;
        k = 0;
        while (left <= end) {
            array[left++] = temp[k++];
        }
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        sortIncDec(arr, n);

    }
}
