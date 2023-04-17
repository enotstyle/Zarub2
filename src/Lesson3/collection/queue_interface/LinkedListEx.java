package Lesson3.collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Ivan");
        queue.add("Petr");
        queue.add("Alex");
        queue.offer("Karl");
        System.out.println(queue);
        queue.remove("Karl");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
