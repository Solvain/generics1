package org.example.arrays;

import java.util.Arrays;

public class ArrayParser {
    public static void sortArrayOfInts(int[] input) {
        System.out.println("Let's sort this array:");

        System.out.println("Before sorting" + Arrays.toString(input));
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;

                }
            }
        }
        System.out.println("After sorting" + Arrays.toString(input));
    }

    public int countLettersAfterSpecified(String input, char specifiedChar) {
        //inputString ->  abcdabcd specified -> 'c' return -> 2;
        int index = input.indexOf(specifiedChar);


        if (index == -1) {
            return 0;
        }


        return input.length() - index - 1;
    }
}









