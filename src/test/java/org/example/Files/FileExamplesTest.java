package org.example.Files;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class FileExamplesTest {

    @Test
    void countFilesInFolderTest() {
        String baseDir = System.getProperty("user.dir");
        String path = "/" + "data" + "/" + "some";
        System.out.println(baseDir + path);
        int i = FileExamples.countFilesInFolder(baseDir + path);
        assertEquals(3, i);
    }
}