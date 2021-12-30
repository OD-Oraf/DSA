package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaLambda {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(41);
        arrayList.add(232);
        arrayList.add(433);
        arrayList.add(43);
        arrayList.add(1);

        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);

        Collections.sort(arrayList);

        arrayList.forEach(n -> System.out.println(n));
        // arrayList.forEach( n ->  {if (n%2 == 0) System.out.println(n);});


    }
}
