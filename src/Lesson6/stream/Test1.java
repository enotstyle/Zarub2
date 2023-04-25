package Lesson6.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("ok");
        list.add("poka");
        list.add("kal");

        List<Integer> list2 = list.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        array= Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("ok");
        set.add("poka");
        set.add("kal");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        System.out.println(set2);

        List<Integer> list3 = set.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(list3);
    }
}
