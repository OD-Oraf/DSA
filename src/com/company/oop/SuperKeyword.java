package com.company.oop;

public class SuperKeyword {

    /*
    *
    * Super class used to:
    * refer immediate parent class instance variable
    * invoke immediate parent class method
    * invoke immediate parent class constructor
    *
    * */
    static class Animal{
        String color = "White";
    }
    //Invoke parent class instance variable
    static class Dog extends Animal{
        String color = "Black";
        void printColor(){
            System.out.println(color);
            System.out.println(super.color);
        }
    }


    public static void main(String[] args){
        Dog d = new Dog();
        d.printColor();
    }
}
