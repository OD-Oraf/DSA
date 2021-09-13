package com.company.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Andy");
        map.put(5, "Randy");
        map.put(2, "Jack");
        map.put(6, "Armin");

        //Traverse map
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }



    }
}
