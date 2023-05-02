package Lesson8.work_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("src/Lesson8/work_with_files/files/test1.txt", "rw")) {

            FileChannel fileChannel = file.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();

            int byteRead = fileChannel.read(buffer);

            while (byteRead > 0) {
                System.out.println("Read " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stix.append((char) buffer.get());
                }

                buffer.clear();
                byteRead = fileChannel.read(buffer);
            }

            System.out.println(stix);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
