package com.company.algorithms.searching;

public class BinarySearch {

    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            //will fail with large values of left, right
//            int mid = (left + right) / 2;
            int mid = left + (right - left)/2;
            if (target < arr[mid]){
                right = mid - 1;
            } else if (target > arr[mid]){
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = { 3, 4, 5, 6, 7, 9, 21,56 };
        int target = 4;
        System.out.println("Target found at index " + binarySearch(arr, target));

    }

}
