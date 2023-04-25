package Lesson5.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;


public class StudentInfo2 {

    void testStudents2(ArrayList<Student> students, Predicate<Student> predicate) {
        for (Student s : students) {
            if (predicate.test((s))) {
                System.out.println(s);
            }
        }
    }
}

class Test3 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo2 info = new StudentInfo2();

        Predicate<Student> p1 = student -> student.age < 30;
        Predicate<Student> p2 = student -> student.sex == 'm';

        info.testStudents2(students, p1.and(p2));
        System.out.println();
        info.testStudents2(students, p1.or(p2));
        System.out.println();
        info.testStudents2(students, p1.negate());
    }
}


