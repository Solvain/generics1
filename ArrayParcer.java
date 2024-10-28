package org.example;

import java.util.Arrays;

public class ArrayParcer {
    private int[] array;

    public ArrayParcer(int[] array) {
        this.array = array;
    }

    public int[] sortArray() {
        // Сортую массив цілих чисел
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    // Для тестування
    public static void main(String[] args) {
        ArrayParcer parser = new ArrayParcer(new int[]{5, 2, 9, 1, 5, 6});
        int[] sortedArray = parser.sortArray();
        System.out.println("Отсортований массив: " + Arrays.toString(sortedArray));
    }
}

