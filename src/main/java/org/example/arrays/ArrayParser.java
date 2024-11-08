package org.example.arrays;

public class ArrayParser {


    public static void sortArrayOfInts(int[] array) {

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

    public String capitaliseLettersFromMentor (String input, String indexes) {
        StringBuilder result = new StringBuilder(input);
        String[] posArray = indexes.split(",");

        for (String posStr : posArray) {
            int pos = Integer.parseInt(posStr);
            if (pos >= 0 && pos < input.length()) {
                char upperChar = (char)(result.charAt(pos) - 32);
                result.setCharAt(pos, upperChar);
            }
        }
        return result.toString();
    }

    public int evenNumberCounter(int [] input) {
        //     count the even numbers in the input array
        return 0;
    }
}

