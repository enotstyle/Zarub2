package Lesson3.collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add(0, "Petr");
        System.out.println(arrayList1);
        System.out.println(arrayList1.get(2));
        arrayList1.set(0, "Zamena");
        System.out.println(arrayList1);
        arrayList1.remove(0);
        System.out.println(arrayList1);
        arrayList1.remove("Zaur");
        System.out.println(arrayList1);
    }
}
