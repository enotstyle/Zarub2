package Lesson3.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("kolya");

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");
        arrayList2.add("Maria");
        arrayList2.add("Igor");

//        arrayList1.removeAll(arrayList2);
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

        System.out.println(arrayList1.containsAll(arrayList2));

        List<String> arrayList3 = arrayList1.subList(1, 2);
        System.out.println(arrayList3);

        Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[5]);

        System.out.println(Arrays.toString(array2));

        List <Integer> list4 = List.of(3, 8, 13);
        System.out.println(list4);
//        list4.add(1);

        List <String> list5 = List.copyOf(arrayList1);
        System.out.println(list5);
    }
}
