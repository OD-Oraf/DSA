package com.company.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollections {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);


        Iterator<Integer> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        
    }
}
