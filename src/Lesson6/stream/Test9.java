package Lesson6.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 28, 'm', 3, 8.8);
        Student st2 = new Student("Petr", 18, 'm', 2, 2.8);
        Student st3 = new Student("Karl", 19, 'm', 1, 1.8);
        Student st4 = new Student("Lena", 22, 'f', 2, 3.8);
        Student st5 = new Student("Mike", 20, 'm', 4, 4.8);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        Student min = studentList.stream().min((x, y) -> x.getCourse() - y.getAge()).get();
        System.out.println(min);

        studentList.stream().limit(3).forEach(e -> System.out.println(e));
        System.out.println();
        studentList.stream().skip(3).forEach(e -> System.out.println(e));
        System.out.println();
        List <Integer> courses = studentList.stream().mapToInt(e -> e.getCourse()).boxed().collect(Collectors.toList());
        System.out.println(courses);

        int some = studentList.stream().mapToInt(e -> e.getCourse()).sum();
        System.out.println(some);



    }
}
