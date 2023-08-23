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

        Set<Student> students = new TreeSet<>();

        students.add(new Student(1, "Nguyễn Văn A", 7.4));
        students.add(new Student(2, "Nguyễn Văn B", 6.2));
        students.add(new Student(3, "Nguyễn Văn C", 7.4));
        students.add(new Student(4, "Nguyễn Văn D", 8.6));
        students.add(new Student(5, "Nguyễn Văn E", 5.6));


        for (Student item : students) {
            System.out.println(item);
        }
    }
}
