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
        int[] charMap = new int[26];
        for (int i = 0; i < order.length(); i++){
            /*order the positions of the alien alphabet
            ||-----------------------------------------------------||
            // Regular Alphabet : A  B  C  D  E  F  G  H  I  J  K  L M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z  //
            // charMap ordering : 2  3  4  5  6  7  8  0  9  10 11 1 12 13 14 15 16 17 18 19 20 21 22 23 24 25 //


            // New Alphabet is : H L A B C D E F G I J K M N O P G R S T U V W X Y Z //
            ||------------------------------------------------------||
            */

            // for every character in order we assign its position
            charMap[order.charAt(i)-'a'] = i;
        }
        //start at 1 to avoid out of bounds index
        for (int i = 1; i < words.length; i++){
            if(compare(words[i-1], words[i]) > 0){
                return false;
            }
        }
        // Print charMap
//        for (int num: charMap) {
////            System.out.print(num + " ");
//        }
        return true;
    }

    public static void main(String[] args){

        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        System.out.println(isAlienDict(words, order));

//        isAlienDict(words, order);

//        System.out.println('b' - 'a');

    }
}
