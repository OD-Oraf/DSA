package com.company.arrays;

import java.util.HashMap;

public class PermutationInAString {

    public static boolean containsPattern(String str, String pattern) {
        int left = 0;
        int matched = 0;
        HashMap<Character, Integer> map = new HashMap();

        // add pattern into hashmap
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
//        System.out.println(map.toString());
        for (int i = 0; i < str.length(); i++) {
            char rightChar = str.charAt(i);
            if (map.containsKey(rightChar) && matched < pattern.length()) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) == 0) {
                    matched++;
                }
            }
        }


        return false;
    }
    public static void main(String[] args) {

        String string = "oidbcaf";
        String pattern = "abc";
        containsPattern(string, pattern);

    }
}
