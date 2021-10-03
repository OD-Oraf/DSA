package com.company.syntax;

public class StringSyntax {
    public static void main(String[] args){
        //Creation
        String stringObj = new String("string");
        String string = "string";

        //Size
        int stringLen = string.length();

        //Access
        char[] charArr = string.toCharArray();
        for(char c : charArr){
            System.out.println(c);
        }
        for(int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i));
        }
    }
}
