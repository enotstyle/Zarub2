package Lesson3.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iter = list.listIterator();
        ListIterator<Character> reversIter = list.listIterator(list.size());
        boolean isPalindrom = true;
        while (iter.hasNext() && reversIter.hasPrevious()) {
            if (iter.next() != reversIter.previous()) {
                isPalindrom = false;
            }
        }
        if (isPalindrom) {
            System.out.println("polindrom");
        } else {
            System.out.println("ne polindrom");
        }
    }
}
