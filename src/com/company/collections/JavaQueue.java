package com.company.collections;

import java.util.*;

public class JavaQueue {

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(4);
        queue.offer(33);
        queue.offer(43);
        queue.offer(8937);

        System.out.println(queue.poll());

        System.out.println(Arrays.toString(queue.toArray()));

    }
}
