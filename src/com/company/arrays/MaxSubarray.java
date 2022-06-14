package com.company.arrays;

public class MaxSubarray {

    public static int maxSubArray(int[] nums){

        int currentSum = nums[0];
        int bestSum = nums[0];

        for (int i = 0; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            bestSum = Math.max(bestSum, currentSum);

        }
        return bestSum;
    }

    public static void main(String[] args) {

        int arr[] = { -2,1,-3,4,-1,2,1,-5,4 };
        System.out.println(maxSubArray(arr));

    }
}
