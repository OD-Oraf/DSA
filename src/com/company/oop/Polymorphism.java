package com.company.oop;

public class Polymorphism {

    //Method Overloading
    //Number of arguments
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }

    //Data types of arguments
    static double add(double a, double b){
        return a + b;
    }
    /*
    Q: Why Method Overloading is not possible by changing the return type of method only?
    A: The JVM decides which method to use based on the parameters passed in, If they only differ by return type,
    the JVM doesn't know which one to choose
     */

    //It's possible to overload the main method but the JVM only calls the one which recieves String[] args.

    public static void main(String args){
        System.out.println("main with String");
    }
    public static void main(){
        System.out.println("main without args");
    }

    public static void main(String[] args){

    }
}
