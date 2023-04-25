package Lesson6.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);
        //5,8,2,4,3
        // accumulator == 5 40 80 320 960
        // element == 8 2 4 3

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list.stream().reduce((accumulator, element) -> accumulator * element);

        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result);
        //5,8,2,4,3
        // accumulator == 1 5 40 80 320 960
        // element == 5 8 2 4 3

        List<String> strings = new ArrayList<>();
        strings.add("privet");
        strings.add("poka");
        strings.add("ok");
        strings.add("bb");
        String result3 = strings.stream().reduce((accumulator, element) -> accumulator + " " + element).get();
        System.out.println(result3);
    }
}
