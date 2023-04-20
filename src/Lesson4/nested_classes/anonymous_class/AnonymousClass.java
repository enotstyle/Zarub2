package Lesson4.nested_classes.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            int c = 10;

            @Override
            public int operation(int a, int b) {
                return a + b;
            }

            void printHello() {
                System.out.println("hello");
            }
        };

        Math m2 = new Math() {
            @Override
            public int operation(int a, int b) {
                return a * b;
            }

        };

        Math2 m3 = new Math2() {
            int i = 3;

            @Override
            public int operation(int a, int b) {
                return a * b;
            }

        };


        System.out.println(m.operation(1, 2));
        System.out.println(m.operation(3, 5));
        System.out.println(m2.operation(3, 4));
    }
}


interface Math {
    int operation(int a, int b);
}

class Math2 {
    int operation(int a, int b) {
        return a / b;
    }

    ;
}