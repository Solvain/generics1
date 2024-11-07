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
            if (str.charAt(i) <= specified) {
                count++;
            }
        }
        return count;
    }

    public String capitaliseLetters(String input, String indices) {
      /*  StringBuilder builder = new  StringBuilder(input);
        int[] indexArray = Arrays.stream(indices.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int index : indexArray) {
            if (index >= 0 && index < builder.length()) {
                char upperChar = Character.toUpperCase(builder.charAt ( index));
                builder.setCharAt(index, upperChar);
            }*/
        StringBuffer buffer = new StringBuffer(input);
        int[] indexArray = Arrays.stream(indices.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int index : indexArray) {
            if (index >= 0 && index < buffer.length()) {
                buffer.setCharAt(index, Character.toUpperCase(buffer.charAt(index)));
            }
        }


        //                        from input  str = abcdabcd // numbers "3,4,5,7"
        //                                         01234567
        //  you must return string                 abcDABcD
        return buffer.toString();
    }
}

