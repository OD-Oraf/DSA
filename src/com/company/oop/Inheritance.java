package com.company.oop;

public class Inheritance {
    public static class Employee{
        float salary = 40000;
    }
    public static class Programmer extends Employee{
        int bonus = 10000;
    }

    public static class Animal{
        void eat(){
            System.out.println("eating...");
        }
    }

    public static class Dog extends Animal{
        void bark(){
            System.out.println("barking...");
        }
    }

    //Multilevel inheritance
    public static class BabyDog extends Dog{
        void weep(){
            System.out.println("weeping...");
        }
    }

    public static void main(String[] args){

        Programmer p = new Programmer();
//        System.out.println("Programmer salary is: " + p.salary);
//        System.out.println("Programmer bonus is: " + p.bonus);

        //Single Inheritance
        BabyDog d = new BabyDog();
        d.bark();
        d.eat();
        //Multilevel Inheritance
        d.weep();
    }
}

