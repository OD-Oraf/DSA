package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Scratch {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,4,5,5};
        Map<Integer, Integer> count = new HashMap<>();

//        for (int num : nums) {
//            count.merge(num,1, Integer::sum);
//        }
        for (int num : nums) {
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        count.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
