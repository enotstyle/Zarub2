package Lesson8.work_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

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

            String text = "\nЯ иду шагаю по Москве.";
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            fileChannel.write(buffer2);

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes()); //сразу создаем и записываем в буфер строку
            fileChannel.write(buffer2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
