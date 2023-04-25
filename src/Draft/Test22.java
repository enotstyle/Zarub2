package Draft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test22 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = s -> s == 5;
        Consumer<Integer> consumer = s -> System.out.println(s);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(11);

        predicateMethod(list, e -> e == 5);
        System.out.println();
        consumerMethod(list, e -> System.out.println(e));
        System.out.println();
        ArrayList<StringBuilder> arrayList2 = new ArrayList<>();
        supplierMethod(arrayList2, () -> new StringBuilder("privet"));


    }

    public static void predicateMethod(ArrayList<Integer> arrayList, Predicate<Integer> predicate) {
        for (Integer e : arrayList) {
            System.out.println(predicate.test(e));
        }
    }

    public static void consumerMethod(ArrayList<Integer> arrayList, Consumer<Integer> consumer) {
        for (Integer e : arrayList) {
            consumer.accept(e);
        }
    }

    public static void supplierMethod(ArrayList<StringBuilder> arrayList2, Supplier<StringBuilder> supplier) {
        for (int i = 0; i < 3; i++) {
            arrayList2.add(supplier.get().append(i));
        }
        System.out.println(arrayList2);
    }
}
