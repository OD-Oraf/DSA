package com.company.strings;

import java.util.Arrays;

public class PalindromePermutation {

    static boolean isPermutePalindrome(String s){
        //Array implementation
        int[] charCounts = new int[128];
        //for each character in i, increment the corresponding ASCII value
        for (int i = 0; i < s.length(); i++){
            charCounts[s.charAt(i)]++;
        }

        System.out.println(Arrays.toString(charCounts));

        //of count is 0 then there are an even number of each character so a palindrome is possible
        // if count is one then only one character doesn't have a match but that still means a palindrome is possible
        //if count greater than one that means more than one character appears and odd amount of time
        int count = 0;
        for (int i = 0; i < 128; i++){
            count += charCounts[i] % 2;
        }



        return count <= 1;
    }
    public static void main(String[] args){

        String s = "carerac";
        System.out.println(isPermutePalindrome(s));




    }
}
