package com.company.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args){

        HashSet<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //   System.out.println(set);

        ArrayList<Integer> setArray = new ArrayList<>(set);

        System.out.println(setArray);


    }
}
