package com.company.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) { // for each index, find the next smallest value
            int minIndex = i;
            for (int j = i+1; j < n; j++) { // search for min value
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex]; // swap current number and min number
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
