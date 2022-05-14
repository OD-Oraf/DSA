package com.company.syntax;


import java.util.LinkedList;
import java.util.Queue;

public class QueueSyntax {
    public static void main(String[] args ){
        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        int[] printedQueue = new int[queue.size()];

        System.out.println(queue);

        queue.offer(2);
        System.out.println(queue);
        
    }
}
