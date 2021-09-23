package com.company.collections;

import java.util.Comparator;

public class ComparatorInterface {

    class Student{
        int id;
        String name;
        int age;

        Student(int id, String name, int age){
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    class AgeComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2){
            return 0;
        }
    }
    public static void main(String[] args){



    }
}
