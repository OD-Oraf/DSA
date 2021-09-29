package com.company.java.features.java8;

import java.util.Locale;
import java.util.Optional;

public class JavaOptional {
    public static void main(String[] args){
        //Optionals used to deal with null pointer exceptions
        //Used the check for the presence of a value for a particular variable

        String[] strArr = new String[10];
        strArr[5] = "Hello";
        strArr[6] = "MARK";
        Optional<String> checkNull = Optional.ofNullable(strArr[5]);
        if(checkNull.isPresent()){
            String lowercaseString = strArr[5].toLowerCase();
            System.out.println(lowercaseString);
        }else{
            System.out.println("String value is not present");
        }


        //Another example
        String[] str = new String[10];
        str[5] = "Java optional class";
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        Optional<String> value = Optional.of(str[5]);
        System.out.println("Filtered value: " + value.filter((s) -> s.equals("Abc")));
        System.out.println("Filtered value: " + value.filter((s) -> s.equals("Java optional class")));


    }
}
