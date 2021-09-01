package com.company.Strings;

public class ValidPalindrome {

    //2 POINTER METHOD - also quite slow
    static boolean isPalindrome1(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            //skip whitespace
            //Continues skips iteration so we dont compare letter to non-letter
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i += 1;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j -= 1;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) !=
                    Character.toLowerCase(s.charAt(j))) {
//                System.out.println(s.charAt(i) + " " + s.charAt(j));
//                System.out.println(i + " " + j);
                return false;
            }
//            System.out.println(s.charAt(i) + " " + s.charAt(j));
//            System.out.println(i + " " + j);]
            i += 1;
            j -= 1;
        }
        return true;
    }

    public static void main(String[] args){
        String test = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome1(test));
    }

}
