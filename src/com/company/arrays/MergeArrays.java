package com.company.arrays;

import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // write your code here
        // can traverse multiple times

        int[] result = new int[arr1.length + arr2.length];
        int p1 = 0;
        int p2 = 0;
        int resultIndex = 0;

        // push smaller values into array
        while(p1 < arr1.length && p2 < arr2.length){
            if (arr1[p1] < arr2[p2]){
                result[resultIndex++] = arr1[p1++]; // push smaller value, update p1 and resultIndex
            } else {
                result[resultIndex++] = arr2[p2++];
            }
        }

        while(p1 < arr1.length){
            result[resultIndex++] = arr1[p1++];
        }

        while(p2 < arr2.length){
            result[resultIndex++] = arr2[p2++];
        }
        return result;

        // make a new resultant array and return your results in that
    }



    public static void main(String[] args){
        int[] arr1 = {1,12,14,17,23}; // creating a sorted array called arr1
        int[] arr2 = {11,19,27};  // creating a sorted array called arr2

        int[] resultantArray = mergeArrays(arr1, arr2); // calling mergeArrays

        System.out.print("Arrays after merging: ");
        System.out.println(Arrays.toString(resultantArray));
//        for(int i = 0; i < arr1.length + arr2.length; i++) {
//            System.out.print(resultantArray[i] + " ");
//        }
    }
}
