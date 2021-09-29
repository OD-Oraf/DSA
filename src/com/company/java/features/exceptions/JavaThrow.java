package com.company.java.features.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaThrow {
    static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("Person not eligible to vote");
        }else{
            System.out.println("Person is eligible to vote");
        }
    }

    //function to check if person is eligible or not to vote
    static void method() throws FileNotFoundException{
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader fineInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }

    public static void main(String[] args){
//        validate(13);
//        System.out.println("rest of code");

        try{
            method();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("rest of the code..");
    }
}
