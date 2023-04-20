package Lesson5.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

//    static I i = (String s) -> s.length();

    public static void main(String[] args) {
        def((String s) -> s.length());
    }
}

interface I {
    int abc(String s);
}