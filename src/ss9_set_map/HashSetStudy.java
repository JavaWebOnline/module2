package ss9_set_map;

import java.util.HashSet;
import java.util.Set;

public class HashSetStudy {
    public static void main(String[] args) {
//        Set<Integer> integerSet = new HashSet<>();
//
//        integerSet.add(10);
//        integerSet.add(20);
//        integerSet.add(20);
//        integerSet.add(20);
//        integerSet.add(30);
//        integerSet.add(40);
//
//        for(Integer item : integerSet) {
//            System.out.println(item);
//        }

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(1, "Nguyễn Văn B", 9.7));
        studentSet.add(new Student(1, "Nguyễn Văn A", 9.6));

        System.out.println(studentSet.size());

        for(Student item : studentSet) {
            System.out.println(item);
        }

//        int[] arr = {10, 20, 30};
//
//        for(int item : arr) {
//            System.out.println(item);
//        }
    }
}
