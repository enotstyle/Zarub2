package Lesson3.collection.map_interface;

import java.util.*;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Ivan", "Terenin", 2);
        Student st3 = new Student("Vika", "Jopa", 1);
        map.put(st1, 7.5);
        map.put(st2, 5.5);
        map.put(st3, 9.5);
        System.out.println(map);

        Student st4 = new Student("Vika", "Jopa", 1);
        boolean result = map.containsKey(st4);
        System.out.println(result);

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());

        Student st5 = new Student("Igor", "Sidorov", 5);
        Integer i = 5;
        System.out.println(Objects.hash(i));

        for (Map.Entry<Student,Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Collection<Double> col = map.values();
        System.out.println(col);

        Set<Map.Entry<Student,Double>> set = map.entrySet();
        System.out.println(set + "!!!!!!!!");



        for (Map.Entry<Student,Double> s: set) {
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }

        System.out.println("xxxxxxxxxxxxxxxxxxx");

        Map<Integer, String > map3 = new HashMap<>();
        map3.put(1, "Ivan");
        map3.put(2, "Daria");
        map3.put(3, "Zaur");
        map3.put(4, "Pavel");

        Set<Integer> set3 = map3.keySet();
        System.out.println(set3);

        Collection<String> col3 = map3.values();
        System.out.println(col3);

        Set<Map.Entry<Integer, String>> entrySet3 = map3.entrySet();
        System.out.println(entrySet3);
        for (Map.Entry<Integer, String> s: entrySet3) {
            System.out.println(s.getValue());
        }

        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);






    }
}

class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

        @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

//    @Override
//    public int hashCode() {
//        return name.length() * 7 + surname.length() * 11 + course * 53;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
