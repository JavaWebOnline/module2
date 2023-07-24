package ss3_static;

import java.util.ArrayList;

public class Main2 {
    static ArrayList<Student> students;

    static {
        students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A"));
        students.add(new Student(2, "Nguyễn Văn B"));
    }

    public static void main(String[] args) {
        System.out.println(students);
    }
}
