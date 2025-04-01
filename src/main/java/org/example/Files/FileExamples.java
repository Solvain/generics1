package org.example.Files;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class FileExamples {
    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1() {
        Path path = Paths.get("example1.txt");
        String content = "Тестовий файл";
        try {
            Files.write(path, content.getBytes());
            System.out.println("Файл example1.txt створений");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example2() {
        Path path = Paths.get("data", "example2.txt");
        try {
            if (!Files.exists(path)) {
                Files.createDirectories(path.getParent());
                Files.write(path, List.of("СТрока 1", "Строка 2"));
            }
            List<String> lines = Files.readAllLines(path);
            System.out.println("Вміст example2.txt:");
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
