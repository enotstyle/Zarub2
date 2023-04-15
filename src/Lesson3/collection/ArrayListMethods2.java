package Lesson3.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListMethods2 {


    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.30);
        Student st2 = new Student("Nikolay", 'm', 23, 2, 6.4);
        Student st3 = new Student("elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        Student st6 = new Student("Mariya", 'f', 23, 3, 7.4);
        studentList.add(st6);
        studentList.remove(st6);
        System.out.println(studentList);
    }
}

class Student {
    private String name;
    public char sex;
    private int age;
    private int course;
    private double abgGrade;

    public Student(String name, char sex, int age, int course, double abgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.abgGrade = abgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", abgGrade=" + abgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.abgGrade, abgGrade) == 0 && Objects.equals(name, student.name);
    }

}
