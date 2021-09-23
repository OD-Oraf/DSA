package com.company.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterface {
    static class Student implements Comparable<Student>{
        int id;
        String name;
        int age;

        Student(int id, String name, int age){
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student student) {
            if(this.age == student.age){
                return 0;
            } else if(this.age > student.age){
                return 1;
            } else {
                return -1;
            }
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


    public static void main(String[] args){
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(101, "Will", 23));
        studentList.add(new Student(102, "John", 13));
        studentList.add(new Student(103, "Mark", 29));

        Collections.sort(studentList);
        System.out.println("Sorted by Age");
        for(Student student : studentList){
            System.out.println(student.toString());
        }


    }
}
