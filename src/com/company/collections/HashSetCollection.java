package com.company.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {
    public static void main(String[] args){
        // Inherits AbstractSet class and implements Set interface
        //Unique Elements only
        //Null values allowed
        //Non synchronized
        //No insertion order
        // The best approach for search operations

        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.remove("Five");
        set.removeIf(str -> str.contains("Three"));

        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }



    }
}
