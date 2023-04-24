package Lesson6.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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

        Map<Integer, List<Student>> map = studentList.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        }).collect(Collectors.groupingBy(el -> el.getCourse()));


        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map <Boolean, List<Student>> map2 = studentList.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));
        System.out.println(map2);

        Student ast6 = studentList.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        }).findFirst().get();
        System.out.println(ast6);


    }
}
