package com.company.java.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class JavaGenerics {
    /*Type Parameters
    *
    * T - Type
    * E - Element(elements in list)
    * K - Key
    * N - Number
    * V - Value
    *
    * */


    //Generic Class
    static class MyGen<T>{
        //T = Type i.e. String Integer Employee
        T obj;

        void add(T obj){
            this.obj = obj;
        }

        T get(){
            return obj;
        }
    }

    static <E> void printArray(E[] elements){
        for (E element : elements){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        /**Advantages of generics
         * 1. Type safety
         * 2. Object type casting not required
         * 3. Compile-Time Checking
         * */
        Map <Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Josh");
        map.put(4,"Mark");
        map.put(2,"Arron");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry e = itr.next();
            System.out.println(e.getKey() + "=" + e.getValue());
        }


        MyGen<Integer> m = new MyGen<Integer>();
        m.add(2);
        System.out.println(m.get());

        Integer[] intArr = { 10, 20, 30, 40, 50 };
        Character[] charArr = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };

        printArray(intArr);
        printArray(charArr);

    }
}
