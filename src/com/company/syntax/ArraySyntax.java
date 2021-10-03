package com.company.syntax;

public class ArraySyntax {
    public static void main(String[] args){

        //Declaration
        int[] arrOneDim = new int[10];
        int[][] arrTwoDim = new int[10][20];
        int[] arrLiteral = {1,2,3,4,5,56,66,7};
        int[][] arrLiteralTwoDim = {{1,2,3}, {4,5,6}, {7,8,9}};

        //Access
        for(int i = 0; i < arrLiteral.length; i++){
            System.out.println(arrLiteral[i]);
        }
        System.out.println(" ");
        for(int i : arrLiteral){
            System.out.println(i);
        }
    }
}
