package Lesson3.collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.getFirst());
        System.out.println(deque.pollLast());
    }
}
