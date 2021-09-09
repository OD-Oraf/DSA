package com.company.collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetVsMap {

    public static void main(String[] args){

        //Set Interface
        //Basically array of unique values
        Set<String> marvelMovies = new LinkedHashSet<>();
        marvelMovies.add("Captain Marvel");
        marvelMovies.add("Thor: Ragnarok");
        marvelMovies.add("Captain America: The Winter Soldier");
        marvelMovies.add("Ant-Man and the Wasp");

//        System.out.println(marvelMovies);

        //Map interface
        //key value pairs, basically python dictionary
        //unique keys
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(101, "Aaliyah");
        students.put(102, "Taylor");
        students.put(103, "Zayn");
        students.put(104, "Sabrina");
        students.put(105, "Paul");

        System.out.println("The size of the Linked Hash Map is:- " + students.size());
        System.out.println(students);

        if(students.containsKey(105)){
            String name = students.get(105);
            System.out.println("The name of the student having Id 105 is:- " + name);
        }

    }
}
