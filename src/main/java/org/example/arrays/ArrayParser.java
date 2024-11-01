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

    public int countLettersAfterSpecified(String str, char specified) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) <= specified) {
                count++;
            }
        }
        return count;
    }
}
