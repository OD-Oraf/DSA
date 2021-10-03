package com.company.syntax;

import java.util.HashMap;
import java.util.Map;

public class HashMapSyntax {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();

        //Add element
        hashMap.put("Black", "White");
        hashMap.put("Sun", "Moon");
        hashMap.put("Car", "Plane");

        //Update element
        hashMap.put("Black", "Cake");

        //Access with Map.Entry
        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + "" + entry.getValue());
        }

        System.out.println(" ");
        //Access with keySet() and values
        for(String key : hashMap.keySet()){
            System.out.println(key);
        }
        for(String value : hashMap.values()){
            System.out.println(value);
        }

    }
}
