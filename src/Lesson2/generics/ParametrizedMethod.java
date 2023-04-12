package Lesson2.generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList <Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);
    }
}


class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}

class GenMethod2 {
    public static <T> String getSecondElement(ArrayList<T> al) {
        return al.get(1) + " такие дела" ;
    }
}
