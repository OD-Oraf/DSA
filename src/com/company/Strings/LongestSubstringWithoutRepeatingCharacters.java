package com.company.Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    static int lengthOfLongestSubString(String s) {
        int p1 = 0;
        int p2 = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet();

        while (p2 < s.length()){
            if (!hashSet.contains(s.charAt(p2))){
                hashSet.add(s.charAt(p2));
                p2 += 1;
                max = Math.max(hashSet.size() , max);
            } else{
                hashSet.remove(s.charAt(p1));
                p1 += 1;
            }
        }
        return max;
    }
    public static void main(String[] args){
        String input = "abcabcbb";
        System.out.println(lengthOfLongestSubString(input));

    }
}
