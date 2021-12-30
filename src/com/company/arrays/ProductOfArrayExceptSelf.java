package com.company.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];

        // Index through array(skip current index) and calculate products
        // Store products in result

        for (int i = 0; i < nums.length; i++){
            int multiplier = 1;
            for (int j = 0; j < nums.length; j++){
                if (i == j){
                    continue;
                }
                multiplier *= nums[j];
            }
            result[i] = multiplier;
        }
        return result;
    }
    public static void main(String[] args){

        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }
}
