package com.company.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollections {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Andy");
        map.put(5, "Randy");
        map.put(2, "Jack");
        map.put(6, "Armin");

        /**entrySet() method
        * Makes set out of map elements
        */

        System.out.println("Printed Set");
        System.out.println(map.entrySet());
        System.out.println("");

        //Traverse map
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
