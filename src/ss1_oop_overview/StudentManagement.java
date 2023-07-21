package ss1_oop_overview;

import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        int n = 2;

        Student student;
        for(int i = 1; i <= n; i++) {
            System.out.printf("Nhập vào thông tin sinh viên thứ %d:\n\n", i);
            student = new Student();
            student.input();

            students.add(student);
        }


        for(int i = 0; i < students.size(); i++) {
            System.out.printf("Thông tin của sinh viên thứ %d\n\n", i + 1);
            students.get(i).output();
        }
    }
}
