package org.example.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ArrayParserTest {
    private final int[] new1 = new int[]{0, 67, 45, 4, 12, -17, -2, 5, 61, 111, 0, -17, 2, 23};
    // length 14
    private final Double[] doubles = new Double []{0.00, 67.24, null, null, 2.11, -1.1, -2.0, null, 61.88, null, 0.67, null, null, null};
    private final Boolean[] bools = new Boolean []{true, false, false, null, true, null, true, true, null, null, false, false, null, null};
    // nn&t - 3 nn&f - 2 bothNull - 4
    private final String testStr = "abcdabcd";

    @Test
    void sortArrayOfIntsTest() {
        int[] copy = new1.clone();
        System.out.println(Arrays.toString(copy));
        ArrayParser.sortArrayOfInts(new1);
        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy));
        assertEquals(Arrays.toString(copy), Arrays.toString(new1), "must be sorted but " + Arrays.toString(new1));

    }

    @Test
    void countLettersTest() {
        ArrayParser parser = new ArrayParser();

        System.out.println("test input-> " + testStr);

        int b = parser.countLettersAfterSpecified(testStr, 'b');

        System.out.println("result after test: " + b);
        assertEquals(4, b, "must be 4 but " + b);
    }

    @Test
    void capitaliseLettersTest() {
        ArrayParser parser = new ArrayParser();

        String result = parser.capitaliseLetters(testStr, "3,4,5,7");
        assertEquals("abcDABcD", result);

        String result2 = parser.capitaliseLetters(testStr, "0,7");
        assertEquals("AbcdabcD", result2);

        String result3 = parser.capitaliseLetters(testStr, "0,1,2,3");
        assertEquals("ABCDabcd", result3);
    }

    @Test
    void capitaliseLettersTest2() {
        ArrayParser parser = new ArrayParser();

        String result = parser.capitaliseLettersFromMentor(testStr, "3,4,5,7");
        assertEquals("abcDABcD", result);

        String result2 = parser.capitaliseLettersFromMentor(testStr, "0,7");
        assertEquals("AbcdabcD", result2);

        String result3 = parser.capitaliseLettersFromMentor(testStr, "0,1,2,3");
        assertEquals("ABCDabcd", result3);
    }

    @Test
    void oddEvenTest() {
        ArrayParser parser = new ArrayParser();

        assertEquals(0, parser.evenNumberCounter(new int[]{7, 7, 7, 7, 7, 7}));
        assertEquals(4, parser.evenNumberCounter(new1));
        assertEquals(6, parser.evenNumberCounter(new int[]{8, 8, 8, 8, 8, 8}));
    }

    @Test
    void nullCheckTest() {
        ArrayParser parser = new ArrayParser();
        int[] ints = parser.nullChecker(doubles, bools);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(new int[] {4, 3, 2}));
        assertEquals(new int[] {4, 3, 2}, ints);
    }
}