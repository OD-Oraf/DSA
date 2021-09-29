package com.company.java.features.exceptions;

public class JavaExceptions {
    public static void main(String[] args){
        try{
            int data = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("rest of the code");
    }
}
