package Lesson6.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 3, 2, 1);
        List<Integer> list = stream1.filter(element -> {
            System.out.println("!!!");
            return element % 2 == 0;
        }).collect(Collectors.toList());
        System.out.println(list);

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream3 = Stream.of(6, 7, 6, 9, 10);
        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
        stream4.forEach(System.out::println);


    }
}
