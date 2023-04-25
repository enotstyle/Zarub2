package Lesson6.stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(s -> System.out.println(s * 2));
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}


class Utils {
    public static void myMethod(int i) {
        i += 5;
        System.out.println("element = " + i);
    }
}