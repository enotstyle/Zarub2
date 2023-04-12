package Lesson2.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("ok");
//        list.add(1);
//        list.add(new StringBuilder("xxxx"));
//        list.add(new Car());
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("prsdfasdfivet");
//        list.add(new Car());

        for (String s : list) {
            System.out.println(s + " " + s.length());
        }
    }
}

class Car {
}
