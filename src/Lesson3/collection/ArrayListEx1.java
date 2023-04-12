package Lesson3.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList <String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        System.out.println(arrayList1);

        ArrayList <String> arrayList2 = new ArrayList<>();

        ArrayList <String> arrayList3 = new ArrayList<>(200);
        arrayList3.add("Zaur");
        arrayList3.add("Ivan");

        List<String> arrayList4 = new ArrayList<>();

        ArrayList<String> arrayList5 = new ArrayList<>(arrayList1);
        System.out.println(arrayList5);

        System.out.println(arrayList5==arrayList1);


    }
}
