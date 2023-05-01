package Lesson8.work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) throws IOException {
        try (FileInputStream reader = new FileInputStream("src/Lesson8/work_with_files/files/pic.png");
             FileOutputStream writer = new FileOutputStream("src/Lesson8/work_with_files/files/pic_copy.png")) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        }
    }
}
