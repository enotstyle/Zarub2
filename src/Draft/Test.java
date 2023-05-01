package Draft;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {


    public static void main(String[] args) {
        ArrayList<Parent> arrayList1 = new ArrayList<>(Arrays.asList(new Parent(), new Parent(), new Parent()));
        ArrayList<Child> arrayList2 = new ArrayList<>(Arrays.asList(new Child(), new Child(), new Child()));
        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        abc(arrayList1);
        abc(arrayList2);
//        abc(arrayList3);

    }

    static <T> void abc(ArrayList<T> arrayList) {
        System.out.println(arrayList);
    }
}


class Parent {
    int a = 5;
}

class Child extends Parent {
    String a = "xxx";
}
