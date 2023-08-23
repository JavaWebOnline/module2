package ss9_set_map;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudy {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>(Collections.reverseOrder());

        integerSet.add(10);
        integerSet.add(30);
        integerSet.add(40);
        integerSet.add(20);
        integerSet.add(20);
        integerSet.add(20);


        for (Integer item : integerSet) {
            System.out.println(item);
        }
    }
}
