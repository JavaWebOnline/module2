package ss9_set_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CompareStudy {
    public static void main(String[] args) {
//        Student s1 = new Student(1, "Nguyễn Văn A", 9.7);
//        Student s2 = new Student(2, "Nguyễn Văn B", 9.5);
//
//        if(s1.compareTo(s2) > 0) {
//            System.out.println("s1 > s2");
//        } else  if(s1.compareTo(s2) < 0) {
//            System.out.println("s1 < s2");
//        } else {
//            System.out.println("s1 = s2");
//        }

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A", 7.4));
        students.add(new Student(2, "Nguyễn Văn B", 6.2));
        students.add(new Student(3, "Nguyễn Văn C", 7.4));
        students.add(new Student(4, "Nguyễn Văn D", 8.6));
        students.add(new Student(5, "Nguyễn Văn E", 5.6));


        // Bài tập 1: Sắp xếp theo điểm tăng gần
        System.out.println("=== Trước khi sắp xếp ===");
        for(Student student : students){
            System.out.println(student);
        }
//        Collections.sort(students);
//        System.out.println("=== Sau khi sắp xếp ===");
//        for(Student student : students){
//            System.out.println(student);
//        }

        // Bài tập 2: Tạo menu
        /*
        Lựa chọn sắp xếp
        1. Sắp xếp theo điểm tăng gần
        2. Sắp xếp theo điểm tăng gần, nếu điểm bằng nhau thì sắp xếp theo id giảm dần
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("====== Lựa chọn sắp xếp ======");
        System.out.println("1. Sắp xếp theo điểm tăng gần");
        System.out.println("2. Sắp xếp theo điểm tăng gần, nếu điểm bằng nhau thì sắp xếp theo id giảm dần");
        System.out.print("Nhập vào lựa chọn của bạn: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                Collections.sort(students);
                // 1. Sắp xếp theo điểm tăng gần
                break;
            case 2:
                Collections.sort(students, new ScoreASCIdDESCComparator());
                // 2. Sắp xếp theo điểm tăng gần, nếu điểm bằng nhau thì sắp xếp theo id giảm dần
                break;
        }


        System.out.println("=== Sau khi sắp xếp ===");
        for(Student student : students){
            System.out.println(student);
        }
    }
}
