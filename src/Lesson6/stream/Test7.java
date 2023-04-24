package Lesson6.stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 28, 'm', 3, 8.8);
        Student st2 = new Student("Petr", 18, 'm', 2, 2.8);
        Student st3 = new Student("Karl", 19, 'm', 1, 1.8);
        Student st4 = new Student("Lena", 22, 'f', 2, 3.8);
        Student st5 = new Student("Mike", 20, 'm', 4, 4.8);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Math");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentList().stream()).forEach(student -> System.out.println(student));
    }
}

class Faculty {
    String name;
    List<Student> studentList;

    public Faculty(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudentToFaculty(Student st) {
        studentList.add(st);
    }
}
