package Lesson3.collection.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {


    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Zaur", 3);
        Student st2 = new Student("Ivan", 2);
        Student st3 = new Student("Vika", 1);
        Student st4 = new Student("Karl", 4);
        Student st5 = new Student("David", 2);
        Student st6 = new Student("Oleg", 2);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st6));
        System.out.println(treeSet.tailSet(st6));

        Student st7 = new Student("Marina", 4);
        System.out.println(treeSet.subSet(st6, st7));
        System.out.println(st2.equals(st5));
        System.out.println(st2.hashCode()==st5.hashCode());

    }


}

class Student implements Comparable<Student>{
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    @Override
    public int compareTo(Student other) {
        return this.course-other.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}