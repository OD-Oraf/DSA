package com.company.javafeatures;

import java.sql.SQLOutput;
import java.util.*;

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
