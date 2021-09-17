package com.company.collections;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args){
        Stack<Integer> stk = new Stack<>();
        //Stack empty() method
        boolean result = stk.empty();

        System.out.println("Is the stack empty? " + result);
        //Stack push() method
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
        System.out.println("Elements in Stack: " + stk);
        result = stk.empty();
        System.out.println("Is the stack empty?" + result);

        //Stack peek() method
        System.out.print("Top element: " + stk.peek());
    }

}
