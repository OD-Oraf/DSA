package com.company.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortCollection {
    public static void main(String[] args){
        ArrayList<String> list =new ArrayList<String>();
        list.add("Viru");
        list.add("Saurav");
        list.add("Mukesh");
        list.add("Tahir");

         Collections.sort(list);

         System.out.println(list);

         Iterator<String> itr = list.iterator();

         while(itr.hasNext()){
             System.out.println(itr.next());
         }


    }
}
