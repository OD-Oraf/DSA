package com.company.syntax;

import java.util.HashSet;

public class HashSetSyntax {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hello");
        hashSet.add("Bear");
        hashSet.add("Cat");

        System.out.println(hashSet.contains("Hello"));

        for(String s : hashSet){
            System.out.println(s);
        }

    }
}
