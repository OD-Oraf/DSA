package com.company.algorithms.searching;

public class LinearSearch {

    static int linearSearch(int[] arr, int target){

        for (int i = 0; i < arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,45};
        int target = 3;
        System.out.println("Target at index " + linearSearch(arr, target));
    }
}
