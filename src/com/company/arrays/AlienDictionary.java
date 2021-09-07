package com.company.arrays;

public class AlienDictionary {

    static int[] charMap;
    static int compare(String word1, String word2){
        int i = 0;
        int j = 0;
        int charCompareVal = 0;
        while(i < word1.length() && j < word2.length() && charCompareVal == 0){
            i++;
            j++;
        }
        if (charCompareVal == 0){
            return word1.length() - word2.length();
        } else {
            return charCompareVal;
        }
    }


    static boolean isAlienDict(String[] words, String order){
        //create map to hold orderings of new alphabet
        charMap = new int[26];
        for (int i = 0; i < order.length(); i++){
            /*order the positions of the alien alphabet
            ||-----------------------------------------------------||
            // New Alphabet is H A C B
            // Regular Alphabet A B C D E F G H O J K ------
            // New alphabet    :1 3  2        0
            ||------------------------------------------------------||
            */
            charMap[order.charAt(i)-'a'] = i;
        }
        //start at 1 to avoid out of bounds index
        for (int i = 1; i < words.length;i++){
            if(compare(words[i-1],words[i]) > 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        System.out.println(isAlienDict(words, order));

    }
}
