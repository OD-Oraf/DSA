package com.company.strings;

public class ValidPalindrome {

    // 2 POINTER METHOD - also quite slow
    // Too slow Dont use
    static boolean isPalindrome1(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i += 1;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j -= 1;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }

    static boolean isPalindrome (String s) {
        // 2 pointer method

        for (int p1 = 0, p2 = s.length() - 1; p1 < p2; p1++, p2--) {
            // Only activates for non ASCII characters
            while (p1 < p2 && !Character.isLetterOrDigit(s.charAt(p1))) {
                p1++;
            }
            // Only activates for non ASCII characters
            while (p1 < p2 && !Character.isLetterOrDigit(s.charAt(p2))) {
                p2--;
            }

            if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args){
        String test = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome1(test));
    }

}
