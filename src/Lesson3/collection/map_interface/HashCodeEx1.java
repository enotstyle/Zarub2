package Lesson3.collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    }
}

class Student {
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
}
