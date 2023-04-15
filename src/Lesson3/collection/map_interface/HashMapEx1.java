package Lesson3.collection.map_interface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Trigulov");
        map1.put(2344, "Ivan Ivanov");
        map1.put(2333, "Maria Sidorova");
        map1.put(4344, "Nickolay Petrov");
        map1.put(2332, "Nickolay Petrov");
//        map1.put(null, "Sergey Petrov");
//        map1.put(21323, null);
        System.out.println(map1);
        map1.putIfAbsent(1000, "Dupl");
        System.out.println(map1.get(2344));
        map1.remove(4344);
        System.out.println(map1);
        System.out.println(map1.containsValue("Maria Sidorova"));
        System.out.println(map1.containsKey(2332));
        Set<Integer> set = map1.keySet();
        System.out.println(set);

        System.out.println(map1.values());
    }
}
