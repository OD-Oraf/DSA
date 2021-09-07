package com.company.dynamicProgramming;

public class FibSequence {

    static int fibSeq(int val){
        if (val <= 2){
            return 1;
        }
        return fibSeq(val - 1) + fibSeq(val - 2);

    }

    public static void main(String[] args){
        int val = 6;
        System.out.println(fibSeq(val));
    }
}
