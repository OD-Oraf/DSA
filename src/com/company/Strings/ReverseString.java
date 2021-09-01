package com.company.Strings;

public class ReverseString {

    public static void main(String[] args){
        //EXTRA MEMORY SOLUTION
//        String original = "pupils";
//        String reverse = "";
//
//        for (int i = original.length() - 1; i >= 0; i-- ){
//            reverse = reverse + original.substring(i,i+1);
//        }
//        System.out.println("Original: " + original);
//        System.out.println("Reversed:  " + reverse);



        //INPLACE SOLUTION
        //Use temp variable
        String string = "cats";
        char[] s = string.toCharArray();
        int p1 = 0;
        int p2 = s.length - 1;
        System.out.println("Before reverse: " + new String(s));


        while (p1 < p2){
            char temp = s[p1];
            s[p1] = s[p2];
            s[p2] = temp;
            p1 += 1;
            p2 -= 1;
        }
        System.out.println("After reverse: " + new String(s));


    }
}
