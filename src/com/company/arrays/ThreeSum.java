package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> searchTriplets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            // skip duplicate for unique
            int complement = -arr[i];
            if (i > 0 && arr[i] == arr[i - 1]) // skip same element to avoid duplicate triplets
                continue;
            searchPair(arr, complement, i + 1, triplets);
        }

        return triplets;
    }

    private static void searchPair(int[] arr, int complement, int left, List<List<Integer>> triplets) {
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == complement) { // found the triplet
                triplets.add(Arrays.asList(-complement, arr[left], arr[right]));
                left++;
                right--;
                while (left < right && arr[left] == arr[left - 1])
                    left++; // skip same element to avoid duplicate triplets
                while (left < right && arr[right] == arr[right + 1])
                    right--; // skip same element to avoid duplicate triplets
            } else if (complement > currentSum)
                left++; // we need a pair with a bigger sum
            else
                right--; // we need a pair with a smaller sum
        }
    }

    public static void main(String[] args) {
        System.out.println(ThreeSum.searchTriplets(new int[] { -3, 0, 1, 2, -1, 1, -2 }));
        System.out.println(ThreeSum.searchTriplets(new int[] { -5, 2, -1, -2, 3 }));
        System.out.println(ThreeSum.searchTriplets(new int[] { -2, 0, 1, 1, 2 }));
    }

}
