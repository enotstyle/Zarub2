package Draft;

import java.nio.ByteBuffer;

public class Buf {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(5);


        buffer.flip();
        buffer.clear();
        int capacity = buffer.capacity();
        int limit = buffer.limit();
        int position = buffer.position();
        System.out.printf("Capacity: %d, position: %d, limit: %d\n", capacity, position, limit);
        System.out.println("Buffer: " + buffer);


    }
}
