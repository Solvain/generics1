package org.example.Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileExamples {
    public static void main(String[] args) {
        countFilesInFolder("C:/Users/user/Documents");
        example1();
        example2();
    }

    public static void countFilesInFolder(String folderPath) {
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            int fileCount = (files != null) ? files.length : 0;
            System.out.println("Кількість файлів у папці " + folderPath + ": " + fileCount);
        } else {
            System.out.println("Вказана дорога до файлу, або його не існує");
        }
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
                Files.write(path, List.of("Строка 1", "Строка 2"));
            }
            List<String> lines = Files.readAllLines(path);
            System.out.println("Вміст example2.txt:");
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}