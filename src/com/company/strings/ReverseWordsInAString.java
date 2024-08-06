package com.company.strings;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        s.trim();// Trim entire

        String[] words = s.trim().split(" ");//string array to iterate each word
        StringBuilder result = new StringBuilder(); //string builder to create result

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                result.append(words[i]).append(" ");
            }
        }


        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = " Let's take LeetCode contest           ";

        String newS = reverseWords(s);
        System.out.println(newS);

    }
}
