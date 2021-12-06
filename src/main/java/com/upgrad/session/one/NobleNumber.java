package com.upgrad.session.one;

import java.util.*;

public class NobleNumber {
    static int nobleNum(int arr[], int n)
    {
        //Write code here
        int nobleNum = -1;
        Map<Integer, Integer> greaterCount = new HashMap<>();

        for (int i = 0 ; i < n ;i++) {
            for (int j = 0 ; j < n && i != j; j++) {
                int valueToCheck = arr[i];
                int valueToCompareAgainst = arr[j];
                if(valueToCheck < valueToCompareAgainst) {
                    Integer count = greaterCount.get(valueToCheck);
                    if(count == null) {
                        greaterCount.put(valueToCheck, 1);
                    } else {
                        greaterCount.put(valueToCheck, ++count);
                    }

                }
            }
        }

        boolean exists = greaterCount.entrySet().stream().anyMatch(e -> e.getKey() == e.getValue());
        if(exists) {
            nobleNum = 1;
        }
        return nobleNum;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(nobleNum(arr, n) + "\n" );
    }
}
