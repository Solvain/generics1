import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testSort() {
        // Тестовий масив
        int[] array = {5, 2, 9, 1, 5, 6};

        // результат
        int[] expected = {1, 2, 5, 5, 6, 9};

        //  метод сортування
        MainTest.sort(array);

        // Перевіряю що масив відсортовано правильно
        assertArrayEquals(expected, array);
    }

    private void assertArrayEquals(int[] expected, int[] array) {
    }

    private static void sort(int[] array) {
    }
}

