package org.example.Files;
import java.io.File;

public class FileExamples {
    public static void main(String[] args) {
        String folderPath = "C:/Users/user/Documents";

        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            int fileCount = (files != null) ? files.length : 0;
            System.out.println("Кількість файлів у папці " + folderPath + ": " + fileCount);
        } else {
            System.out.println("Вказана дорога до файлу, або його не існує");
        }
    }
}
