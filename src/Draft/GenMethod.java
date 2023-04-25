package Draft;

import java.util.ArrayList;

public class GenMethod {


    public static void main(String[] args) {
        B b = new B();
        def(b);
    }
    public static <T> void def(T t) {
        System.out.println(t);
    }
}


class A {
    int a = 1;
}
class B extends A {
    int b = 2;
}
