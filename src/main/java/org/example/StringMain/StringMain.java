package org.example.StringMain;

public class StringMain {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Привіт, Java");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        String str4 = new String(str1);


        System.out.println("Довжина str1: " + str1.length());
        System.out.println("Символ на 2-й позиції: " + str1.charAt(1));
        System.out.println("Чи містить 'світе': " + str1.contains("світе"));
        System.out.println("Чи починається з 'Привіт': " + str1.startsWith("Привіт"));
        System.out.println("Чи закінчується на '!': " + str1.endsWith("!"));
        System.out.println("Позиція 'світе': " + str1.indexOf("світе"));
        System.out.println("Замінити 'світе' на 'Java': " + str1.replace("світе", "Java"));
        System.out.println("Нижній регістр: " + str1.toLowerCase());
        System.out.println("Обрізка пробілів: '" + "  Java  ".trim() + "'");
        System.out.println("Чи дорівнює str1 str2: " + str1.equals(str2));
        System.out.println("Порівняння str1 і str2: " + str1.compareTo(str2));
        System.out.println("Додавання строк: " + str1.concat(" Як справи?"));


        String regexExample = "abc";
        System.out.println(STR."Чи відповідає abc шаблону: \{regexExample.matches("[a-z]+\\d+")}");

        String replaceAllExample = "Java is cool. Java is fun.";
        System.out.println("Замінити Java на Python: " + replaceAllExample.replaceAll("Java", "Python"));

        String splitExample = "яблуко,груша,виноград";
        String[] fruits = splitExample.split(",");
        System.out.println("Розбиття строки за комою:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String substringExample = "Програмування";
        System.out.println("Підстрока з 3 до 7 символу: " + substringExample.substring(2, 7));


        int num1 = 2;
        int num2 = 4;
        System.out.println(String.format("Число з нулями: %02d і %04d", num1, num2));


        String binaryStr = "1010";
        String hexStr = "1A";

        System.out.println("Бінарне число: " + binaryStr);
        System.out.println("Шістнадцяткове число: " + hexStr);
    }
}



