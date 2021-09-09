package com.company.collections;

public class Greeter {


    public void greet(){
        System.out.print("Hello World");
    }

    public static void main(String[] args){
        //lambda functions
        Greeter greeter  = new Greeter();
        greeter.greet();

    }
}
