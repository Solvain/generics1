package org.example.mockito;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;

public class UploadToSomeTest {

    @Test
    public void execute() {
        String dataBaseTest = "db_001";
        Long systemTest = 1L;
        UploadToSome uploadToSome = spy(new UploadToSome());
        uploadToSome.setDataBase(dataBaseTest);
        uploadToSome.setSystem(systemTest);

        String execute = uploadToSome.execute("12321312390hgfghgfhfghgfhdfvsd");
        verify(uploadToSome).upload(anyString(), anyLong());
        assertTrue(execute.endsWith("uploaded"));
    }
}