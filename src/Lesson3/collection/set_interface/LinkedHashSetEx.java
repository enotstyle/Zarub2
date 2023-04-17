package Lesson3.collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(9);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(99);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.isEmpty());
        linkedHashSet.remove(3);
        System.out.println(linkedHashSet.contains(2));


    }
}
