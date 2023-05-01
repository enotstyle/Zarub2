package Lesson8.work_with_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputOutputStream {
    public static void main(String[] args) throws IOException {
        List<String> employees = new ArrayList<>();
        employees.add("zaur");
        employees.add("ivan");
        employees.add("vika");
        employees.add("gena");

        Employee employee = new Employee("ivan", "it", 28, 200);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Lesson8/work_with_files/files/test1.bin"))) {
            out.writeObject(employees);
            out.writeObject(employee);
            System.out.println("done");
        }
    }
}

class ReadObjectFromFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> employees;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Lesson8/work_with_files/files/test1.bin"))) {
            employees = (ArrayList)in.readObject();
            Employee employee = (Employee)in.readObject();
            System.out.println(employees);
            System.out.println(employee);
        }
    }
}


class Employee implements Serializable{
    static final long serialVersionUID = 2;
    transient String name;
    String department;
    int age;
    double salary;

    public Employee(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}