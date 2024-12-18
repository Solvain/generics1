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
            if (str.charAt(i) <= specified) {
                count++;
            }
        }
        return count;
    }

    /*  public String capitaliseLetters(String input, String indices) {
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
  */
    public int evenNumberCounter(int[] ints) {
        int count = 0;
        for (int number : ints) {
            if (number % 2 == 0 && number != 0) {
                count++;
            }
        }
        return count;
    }


    public String capitaliseLetters(String str, String indices) {
        char[] chars = str.toCharArray();
        String[] indexArray = indices.split(",");

        for (String indexStr : indexArray) {
            int index = Integer.parseInt(indexStr);
            if (index >= 0 && index < chars.length) {
                if (chars[index] >= 'a' && chars[index] <= 'z') {
                    chars[index] = (char) (chars[index] - 32);
                }

            }
        }
        return new String(chars);
    }

    public String capitaliseLettersFromMentor(String input, String indexes) {
        StringBuilder result = new StringBuilder(input);
        String[] posArray = indexes.split(",");

        for (String posStr : posArray) {
            int pos = Integer.parseInt(posStr);
            char upperChar = (char) (result.charAt(pos) - 32);
            result.setCharAt(pos, upperChar);
        }
        return result.toString();
    }


    public int[] nullChecker(Double[] input1, Boolean[] input2) {
        //     2 arrays the same length like this { 0, 3, null } and { true, false , null }
        //  calculate 3 conditions and write them into array
        //  index 0 - both null, index 1 - Double not null and boolean true , index 2 Double not null and boolean false
        // out must be like this- { 2, 1, 5 }
        int [] out = new int[3];
        // your code
        return out;
    }
}


