package Lesson8.work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("src/Lesson8/work_with_files/files/test1.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
            System.out.println();
            System.out.println("done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }

    }
}
