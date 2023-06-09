package Lesson2.generics;

public class ParametrizeClass {
    public static void main(String[] args) {
        Info <String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();

        Info <Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer s1 = info2.getValue();
    }

//    public void abc(Info <String> info ) {
//        String s = info.getValue();
//    }

    public void abc(Info <Integer> info ) {
        Integer i = info.getValue();
    }

//    public void abc(Info info )
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

class Parent {
        public void abc(Info <String> info ) {
        String s = info.getValue();
    }
}

class Child extends Parent {
//    public void abc(Info <Integer> info ) {
//        Integer s = info.getValue();
//    }
}