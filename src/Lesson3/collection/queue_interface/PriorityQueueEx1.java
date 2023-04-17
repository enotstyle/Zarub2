package Lesson3.collection.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {


    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(33);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());

    }
}
