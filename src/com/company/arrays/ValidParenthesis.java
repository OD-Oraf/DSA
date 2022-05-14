package com.company.arrays;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s){
        // Stack-HashMap solution
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            // Closing Bracket
            if (map.containsKey(c)){
                if (stack.isEmpty()) {
                    return false;
                }
                if (map.get(c) != stack.peek()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
            if (!map.containsKey(c)) {
                stack.push(c);
            }
        }

        return stack.isEmpty();


    }
    public static void main(String[] args){
//        final long startTime = System.nanoTime();

        String s = "{[()]}";
        System.out.println(isValid(s));

//        final long duration = System.nanoTime() - startTime;
//        System.out.println(duration);
    }
}
