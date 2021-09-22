package com.company.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaCollectionsClass {
    public static void main(String[] args){
        ArrayList<String> strList = new ArrayList<>();
        strList.add("C");
        strList.add("Core Java");
        strList.add("Advanced  Java");
        Collections.addAll(strList, "Servlet", "JSP");

        System.out.println(strList);

        String[] strArr = {"C#", ".NET"};
        Collections.addAll(strList, strArr);
        System.out.println(Collections.max(strList));

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(46);
        intList.add(67);
        intList.add(24);
        intList.add(16);
        intList.add(8);
        intList.add(12);
        System.out.println("max value: "+Collections.max(intList));
        System.out.println("min value: "+Collections.min(intList));

    }
}
