package com.company.collections;

import java.util.*;

public class ListInterface {
    public static void main(String[] args){
        //Array list
        List<String> list = new ArrayList<>();
        list.add("mango");
        list.add("apple");
        list.add("bananas");
        list.add("grapes");
        list.set(1, "dates");

        //Convert array to ArrayList
        String[] arr = {"Java","Python","PHP","C++"};
        List<String> langs = Arrays.asList(arr);

        //Sorting array
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(21);
        nums.add(11);
        nums.add(51);
        nums.add(1);

        //Collection sort for ArrayList
        //Arrays.sort for regular array
        Collections.sort(nums);


        //Iterator
        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("Marco");
        names.add("Kristina");
        names.add(1,"Will");

        ListIterator<String> itr  = names.listIterator();

        System.out.println("Traversing elements in forward direction");
        while (itr.hasNext()){
            System.out.println("index: " + itr.nextIndex() + " value " + itr.next());
        }

        System.out.println("Traversing through elements in backwards direction");
        while (itr.hasPrevious()){
            System.out.println("index: " + itr.previousIndex() + " value: " + itr.previous());
        }


    }
}
