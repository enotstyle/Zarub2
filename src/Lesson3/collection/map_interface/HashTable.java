package Lesson3.collection.map_interface;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Ivan", "Terenin", 2);
        Student st3 = new Student("Vika", "Jopa", 1);
        Student st4 = new Student("Sasha", "Irodov", 2);
        ht.put(5.8, st1);
        ht.put(7.8, st2);
        ht.put(2.8, st3);
        ht.put(3.2, st4);
//        ht.put(null, st4);
//        ht.put(2.2, null);
        System.out.println(ht);

    }
}
