package com.company.strings;

public class ValidPalindrome2 {

    static boolean isValidPalindrome(String s){
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2){
            if(s.charAt(p1) != s.charAt(p2)){
                return helper(s, p1 + 1, p2) || helper(s, p1, p2 - 1);
            }
            p1 += 1;
            p2 -= 1;
        }

        return true;
    }

    static boolean helper(String s, int i, int j){
        int p1 = i;
        int p2 = j;

        while (p1 < p2){
            if(s.charAt(p1) != s.charAt(p2)){
                return false;
            }
            p1 += 1;
            p2 -= 1;
        }

        return true;

    }
    public static void main(String[] arg){

        String s = "acjba";
        System.out.println(isValidPalindrome(s));

    }
}
