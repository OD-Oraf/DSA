package com.company.recursion;

public class SumToN {
    public static int sumToN(int n){
        if (n <= 1){
            return n;
        } else {
            return n + sumToN(n - 1);
        }

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumToN(5));
    }
}
