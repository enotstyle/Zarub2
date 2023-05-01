package Lesson8.work_with_files;

import java.io.*;

public class DataInputOutputStream {
    public static void main(String[] args) throws IOException {
        try (DataInputStream input = new DataInputStream(new FileInputStream("src/Lesson8/work_with_files/files/test1.txt"));
             DataOutputStream out = new DataOutputStream(new FileOutputStream("src/Lesson8/work_with_files/files/test1.txt"))) {
            out.writeBoolean(true);
            out.writeDouble(2.4);
            out.writeChar('c');
            out.writeLong(1000000L);

            System.out.println(input.readBoolean());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
            System.out.println(input.readLong());
        }
    }
}
