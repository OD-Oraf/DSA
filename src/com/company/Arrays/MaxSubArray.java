package com.company.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxSubArray {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int subArrayLen = 4;
        int arrLen = arr.length;

        System.out.println(maxSubArray(arr,arrLen,subArrayLen));

    }

    public static int maxSubArray(int arr[], int len, int k){

        int max = 0;
        //if len of array is shorter than subarray its invalid input
        if (len < k){
            System.out.println("Invalid input");
            return -1;
        }
        //SETUP
        //Initial subarray sum of length k
        for (int i = 0;i < k; i++) {
            max += arr[i];
        }
//        System.out.println(max);
        //ACTUAL ALGORITHM
        //Sliding window, start at end of Setup subarray
        //for each window slide, subtract left-most number, add right-most number
        int currMax = max;
        for (int i = k ; i < len; i++){
            currMax += arr[i];
            currMax -= arr[i-k];
            System.out.println(arr[i]+" "+arr[i-k]);
            max = Math.max(max, currMax);
        }
        return max;
    }
}