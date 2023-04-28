package Draft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unset {
    public static void main(String[] args) {
        List<Integer> listHistory = new ArrayList<>(Arrays.asList(21613, 21495, 21493, 21491, 21489, 21487,
                21485, 21483, 21481, 21479, 21477, 21473, 21463, 21125, 21107, 21085, 21063, 21061, 21041,
                21039, 21033, 21031, 20945, 20855, 20853, 20749, 15427, 15425, 15361, 15359, 15357, 14473,
                14471, 14469, 10573, 10545, 10483, 10467, 10461, 10459));

        List<Integer> listMyBets = new ArrayList<>(Arrays.asList(21107, 21125, 21463, 21473, 21477, 21479,
                21481, 21483, 21485, 21487, 21489, 21491, 21493, 21495, 21613));

        System.out.println(listHistory.size());
        listHistory.removeAll(listMyBets);
        System.out.println(listHistory);
        System.out.println(listHistory.size());
    }
}
