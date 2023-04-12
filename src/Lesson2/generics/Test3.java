package Lesson2.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
//        list.add("hello");

        List<? extends Number> list30 = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(2.22);
        list1.add(4.22);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("privet");
        list2.add("poka");
        showListInfo(list2);

        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(3.14);
        arrayList.add(2.22);
        arrayList.add(4.22);
        System.out.println(summ(arrayList));

    }

    static void showListInfo(List<?> list) {
        System.out.println("лист содержит следующие элементы " + list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
