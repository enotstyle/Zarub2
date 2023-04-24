package Lesson6.stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 4, 7, 5, 6, 8, 99, 22, 33, 44, 22, 3, 12};
        int result = Arrays.stream(array).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((accumulator, element) -> accumulator + element).getAsInt();
        System.out.println(result);
    }
}
