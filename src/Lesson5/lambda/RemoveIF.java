package Lesson5.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIF {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("privet");
        al.add("poka");
        al.add("ok");
        al.add("java");
        al.add("string");
//        al.removeIf((String s) -> s.length() < 3);
        Predicate<String> p = (String s) -> s.length() < 3;
        al.removeIf(p);
        System.out.println(al);
    }
}
