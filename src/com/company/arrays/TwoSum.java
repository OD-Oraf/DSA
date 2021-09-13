package com.company.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //2 pointers Solution n^2 time complexity

    public static int[] twoSumTwoPoint(int[] nums, int target){
        int p1;
        int p2;
        for (p1 = 0; p1 < nums.length; p1++){
            for (p2 = p1 + 1 ; p2 < nums.length;p2++){
                if (nums[p1] + nums[p2] == target){
                    return new int[] {p1,p2};
                }
            }
        }
        return null;
    }



    // Two pass Hash Map
    public static int[] twoSumHashMap(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        //pass 1 put elements into array
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        //2nd pass to check for complement
        for (int i =0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSumHashMap(nums, target)));
    }
}
