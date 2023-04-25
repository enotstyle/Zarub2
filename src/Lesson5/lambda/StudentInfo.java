package Lesson5.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> students, StudentChecks studentChecks) {
        for (Student s : students) {
            if (studentChecks.check((s))) {
                System.out.println(s);
            }
        }
    }

}

class Test {
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
//        info.testStudents2(students, new CheckOverGrade2());
        System.out.println("-------------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
        System.out.println("-------------------------");
//        info.testStudents(students, (Student s) -> s.age < 30);
//        System.out.println("-------------------------");
//        info.testStudents(students, (Student s) -> s.avgGrade > 8);
//        System.out.println("-------------------------");
//        info.testStudents(students, (Student s) -> s.age < 30 && s.avgGrade > 5);
//        System.out.println("-------------------------");
//        info.testStudents(students, s -> s.age < 30);
        System.out.println("-------------------------");
        StudentChecks sc = s -> s.age < 30;
        System.out.println(sc.check(st3));
        System.out.println("-------------------------");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(students);
        Collections.shuffle(students);
        Collections.sort(students, (Student s1, Student s2) -> s1.name.compareTo(s2.name));
        System.out.println(students);

        Function<Student, Double> f = s -> s.avgGrade;
        System.out.println(avgSmth(students, s -> s.avgGrade / students.size()));
    }

    private static double avgSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s : list) {
            result += f.apply(s);
        }
        return result;
    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}