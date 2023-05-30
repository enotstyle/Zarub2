package anotation;

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child("Ivan");
        p.showInfo();
    }
}


class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }


    void showInfo() {
        System.out.println("Its parent class Name = " + name);
    }
}


class Child extends Parent {

    public Child(String name) {
        super(name);
    }


    @Override
    void showInfo() {
        System.out.println("Its child class Name = " + name);
    }
}