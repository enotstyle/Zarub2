package Lesson3.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("kolya");

        Iterator<String> iter = arrayList1.iterator();
        while (iter.hasNext()) {

            if (iter.next() == "Ivan") {
                iter.remove();
            }
        }
        System.out.println(arrayList1);
    }
}
