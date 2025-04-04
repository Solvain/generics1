package org.example.Files;
import java.nio.file.*;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("data/example.txt");

        Files.createDirectories(path.getParent());
        Files.writeString(path, "Hello for example1.txt");

        String content = Files.readString(path);
        System.out.println("Read for data/example1.txt: " + content);
    }
}
