package com.company.arrays;

public class ReverseWordsInString {
    public static StringBuilder trimSpaces (String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        // Remove leading spaces
        while (p1 <= p2 && s.charAt(p1) == ' ') {
            p1++;
        }
        // Remove trailing spaces
        while (p1 <= p2 && s.charAt(p2) == ' ') {
            p2--;
        }

        StringBuilder sb = new StringBuilder();
        while (p1 <= p2) {
            char c = s.charAt(p1);
            // append to string builder until you hit space
            if (c != ' ') {
                sb.append(c);
            }
            // Make sure we don't double the space between words
            else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            ++p1;
        }
        return sb;
    }

    public void reverse (StringBuilder sb, int p1, int p2) {
        while (p1 < p2) {
            char temp = sb.charAt(p1);
            sb.setCharAt(p2, sb.charAt(p1));
            sb.setCharAt(p1, temp);
            p1++;
            p2--;
        }
    }
    public static String reverseWords(String sentence) {
        /* Steps:
            1. Trim spaces/ convert to array
            2. Reverse entire array
            3. Reverse each word
            4. Join array into string

        */
        String reversed = "";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            reversed = c + reversed;
        }

        int sentenceEndIndex = sentence.length() - 1;

        int p1 = 0;
        int p2 = 1;

        while (p1 < p2) {

        }


        return "";
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("We love python"));
    }
}
