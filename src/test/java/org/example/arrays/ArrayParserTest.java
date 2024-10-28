package org.example.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ArrayParserTest {
    private final int[] new1 = new int[]{0, 67, 45, 4, 12, -17, -2, 5, 61, 111, 0, -17, 2, 23};
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
        assertEquals(2, b, "must be 4 but " + b);
    }
}