package com.company.algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void merge(int[] inputArray, int[] left, int[] right) {
        int leftLen = left.length;
        int rightLen = right.length;

        int i = 0, j = 0, k = 0;

        while (i < leftLen && j < rightLen) {
            if (left[i] <= right[j]) {
                inputArray[k] = left[i];
                i++;
            } else {
                inputArray[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftLen) {
            inputArray[k] = left[i];
            i++;
            k++;
        }
        while (j < rightLen) {
            inputArray[k] = right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) { // Terminate condition for array partitioning
            return;
        }

        int midIndex = inputLength / 2; // find midpoint and divide array into left and right partitions
        int[] left = new int[midIndex]; // create left partition
        int[] right = new int[inputLength - midIndex]; // create right partition

        for (int i = 0; i < midIndex; i++) { // fill left partition
            left[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) { // fill right partition
            right[i - midIndex] = inputArray[i];
        }

        mergeSort(left); // recursively pass in and split left partition
        mergeSort(right); // recursively pass in and split right partition
        merge(inputArray,left, right);
    }
    public static void main(String[] args) {

        Random rand = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100);
        }

        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
