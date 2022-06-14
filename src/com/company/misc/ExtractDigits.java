package com.company.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractDigits {

    public static List<Integer> extractDigits(int num) {
        List<Integer> result = new ArrayList<>();

        while (num > 0) {
            int extractLast = num % 10;
            result.add(extractLast);

            num /= 10;
            System.out.println(num);
        }

        return result;
    }
    public static void main(String[] args) {
        List<Integer> result;
        result = extractDigits(145673);
        System.out.println(Arrays.toString(result.toArray()));

    }
}
