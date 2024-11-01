package org.example.arrays;

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
}

