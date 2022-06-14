package com.company.misc;

public class HappyNumber {
    public static boolean isHappyNumber(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        } while (slow != fast);
        return slow == 1;
    }

    public static int findSquareSum(int num) {
        int totalSum = 0;
        int extractDigit;
        while (num > 0) {
            extractDigit = num % 10;
            totalSum += extractDigit * extractDigit;
            num /= 10;
        }
        System.out.println(totalSum);
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(isHappyNumber(23));
    }
}
