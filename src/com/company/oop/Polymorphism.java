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

    //It's possible to overload the main method but the JVM only calls the one which receives String[] args.
    public static void main(String args){
        System.out.println("main with String");
    }
    public static void main(){
        System.out.println("main without args");
    }



    //Method Overriding
    static class Vehicle{
        void run(){
            System.out.println("Vehicle is running");
        }
    }
    static class Bike extends Vehicle{

    }
    static class MotorBike extends Vehicle{
        void run(){
            //Overrides Vehicle run
            System.out.println("Motorbike is running");
        }

    }

    //Covariant Return Type
    //When overriding you can return a subclass type of original return type
    //This example returns A but, you can change the return type to B1 because it is a child class of A
    static class A{
        A get(){
            return this;
        }
    }

    static class B1 extends A {
        @Override
        B1 get() {
            return this;
        }
        void message(){
            System.out.println("Covariant return type");
        }
    }

    public static void main(String[] args){
        MotorBike bike = new MotorBike();
        bike.run();

        System.out.println(1984-1967);
        new B1().get().message();
    }
}
