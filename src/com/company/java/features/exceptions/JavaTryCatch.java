package com.company.java.features.exceptions;

public class JavaTryCatch {
    public static void main(String[] args){
        try{
            int data = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");



        try{
            int data1 = 50/0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");

    }


}
