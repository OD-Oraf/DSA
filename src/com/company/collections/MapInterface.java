package com.company.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args){
        Map map = new HashMap();
        map.put(1, "Andy");
        map.put(5, "Randy");
        map.put(2, "Jack");
        map.put(6, "Armin");

        //Traverse map
        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
