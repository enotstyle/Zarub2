package Lesson8.work_with_files;

import java.io.*;

public class BufferedWriterReaderEx1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("src/Lesson8/work_with_files/files/test1.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("src/Lesson8/work_with_files/files/test2.txt"))) {
            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }

            System.out.println("done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
