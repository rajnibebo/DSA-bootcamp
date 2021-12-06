package com.upgrad.session.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicatesInArray {
    static int duplicate(int arr[], int n)
    {
        //Write code here
        int duplicate = -1;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0 ; i < arr.length; i++) {
            int valueToCheck = arr[i];
            Integer existingValue = countMap.get(valueToCheck);
            if(existingValue == null) {
                countMap.put(valueToCheck, 1);
            } else {
                duplicate = valueToCheck;
                break;
            }

        }
        return duplicate;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(duplicate(arr, n));
    }
}
