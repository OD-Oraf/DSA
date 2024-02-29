package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Scratch5 {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int[] nums = new int[]{23,54,34,6566,32,1,33};

        for (int num : nums) {
            maxHeap.add(num);
//            System.out.println(maxHeap.peek());

        }

        Integer[] queueToArray = maxHeap.toArray(new Integer[maxHeap.size()]);
        System.out.println(Arrays.toString(queueToArray));

        while (maxHeap.size() > 0) {
            int pop = maxHeap.poll();
            System.out.println(pop);
        }
    }
}
