package Lesson6.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
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

        studentList.stream().map(element -> {
            element.getName().toUpperCase();
            return element;
        }).filter(element -> element.getSex() == 'm').sorted((x, y) -> x.getAge() - y.getAge()).forEach(System.out::println);


        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2);
//        stream2.distinct().forEach(e -> System.out.println(e));

//        System.out.println(stream2.count());
//        System.out.println(stream2.distinct().count());
        System.out.println(stream2.distinct().peek(System.out::println).count());

    }

}

class Student {
    private String name;
    private int age;
    private int course;
    private char sex;
    private double avgGrade;

    public Student(String name, int age, char sex, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", sex=" + sex +
                ", avgGrade=" + avgGrade +
                '}';
    }
}