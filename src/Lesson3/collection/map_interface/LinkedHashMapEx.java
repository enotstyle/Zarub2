package Lesson3.collection.map_interface;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, false);
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Ivan", "Terenin", 2);
        Student st3 = new Student("Vika", "Jopa", 1);
        Student st4 = new Student("Sasha", "Irodov", 2);


        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(7.8, st2);
        linkedHashMap.put(2.8, st3);
        linkedHashMap.put(3.2, st4);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap.get(7.8));

    }
}
