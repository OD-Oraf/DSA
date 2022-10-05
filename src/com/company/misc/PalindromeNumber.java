package com.company.misc;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int lastDigit = x % 10;
            x /= 10;
            reversed = (reversed * 10) + lastDigit;
        }

        // X == reversed / 10 is to get rid of middle number is x is odd digits
        if (x == reversed || x == reversed / 10) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int number  = 121;
        System.out.println(isPalindrome(number));
    }
}
