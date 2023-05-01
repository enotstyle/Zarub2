package Lesson8.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("src/Lesson8/work_with_files/files/test1.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(20);
            String s2 = file.readLine();
            System.out.println(s2);
            System.out.println(file.getFilePointer());

            file.writeBytes("1");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
