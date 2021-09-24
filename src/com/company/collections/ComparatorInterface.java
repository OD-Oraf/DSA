package com.company.collections;

import java.util.*;

public class ComparatorInterface {

    static class Student{
        int id;
        String name;
        int age;

        Student(int id, String name, int age){
            this.id = id;
            this.name = name;
            this.age = age;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class AgeComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2){
            Student s1 = (Student)o1;
            Student s2 = (Student)o2;

            if(s1.age == s2.age){
                return 0;
            } else if (s1.age > s2.age){
                return 1;
            } else{
                return -1;
            }
        }
    }

    static class NameComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2){
            Student s1 = (Student)o1;
            Student s2 = (Student)o2;

            return s1.name.compareTo(s2.name);
        }
    }

    public static void main(String[] args){

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101,"Mark",27));
        al.add(new Student(102,"Kid",37));
        al.add(new Student(103,"Jai",30));

        System.out.println("Sorting by Name");
        Collections.sort(al, new NameComparator());
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.id+" "+st.name+" "+st.age+" ");
        }



    }
}
