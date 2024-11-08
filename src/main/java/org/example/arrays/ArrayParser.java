package org.example.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayParser {


    public void sortArrayOfInts(int[] array) {

        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }


    public int countLettersAfterSpecified(String str, char specified) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > specified) {
                count++;
            }
        }
        return count;
    }


    public String capitaliseLetters(String input, String indices) {
        StringBuilder result = new StringBuilder(input);
        String[] posArray = indices.split(",");

        for (String posStr : posArray) {
            int pos = Integer.parseInt(posStr.trim());
            if (pos >= 0 && pos < input.length()) {
                char upperChar = Character.toUpperCase(result.charAt(pos));
                result.setCharAt(pos, upperChar);
            }
        }
        return result.toString();
    }

//
        //                        from input  str = abcdabcd // numbers "3,4,5,7"
        //                                         01234567
        //  you must return string                 abcDABcD

    }

    public int evenNumberCounter(int [] input) {
        //     count the even numbers in the input array
        return 0;
    }
}

