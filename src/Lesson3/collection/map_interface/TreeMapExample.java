package Lesson3.collection.map_interface;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Ivan", "Terenin", 2);
        Student st3 = new Student("Vika", "Jopa", 1);
        Student st4 = new Student("Sasha", "Irodov", 2);
        Student st5 = new Student("Petr", "Petrov", 3);
        Student st6 = new Student("Elena", "Karasyeva", 2);
        Student st7 = new Student("Igor", "Baranov", 4);
//        Student st8 = new Student("Igor", "Baranov", 4);
        treeMap.put(5.8, st1);
        treeMap.put(7.8, st6);
        treeMap.put(2.8, st3);
        treeMap.put(3.2, st7);
        treeMap.put(0.8, st5);
        treeMap.put(3.8, st2);
        treeMap.put(1.8, st4);
//        treeMap.put(2.2, st8);

        System.out.println(treeMap);
        System.out.println(treeMap.get(0.8));
        treeMap.remove(5.8);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(2.4));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());

        TreeMap<Student, Double> treeMap2 = new TreeMap<>();
        treeMap2.put(st1, 5.8);
        treeMap2.put(st6, 7.8);
        treeMap2.put(st3, 2.8);
        treeMap2.put(st7, 3.2);
        treeMap2.put(st5, 0.8);
        treeMap2.put(st2, 3.8);
        treeMap2.put(st4, 1.8);
        System.out.println(treeMap2);
//        TreeMap<Student, Double> treeMap3 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });
    }
}

