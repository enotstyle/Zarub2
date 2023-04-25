package Lesson5.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela", "norm", "poka");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(s -> System.out.println(s));
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(1);
        list2.add(4);
        list2.add(6);
        list2.add(4);
        list2.forEach(s -> {
            System.out.println(s);
            s*=2;
            System.out.println(s);
        });
    }

}
