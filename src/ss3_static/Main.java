package ss3_static;

import ss3_static.util.LocalDateTimeUtil;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyễn Văn A");
        Student s2 = new Student(2, "Nguyễn Văn B");

        Student.schoolName = "Kinh Tế";

        System.out.println(Student.schoolName);
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);

        System.out.println("Pi: " + Math.PI);
        System.out.println("Căn bậc 2: " + Math.sqrt(4));


        LocalDate localDate = LocalDate.now();

        String strLocalDate = LocalDateTimeUtil.format(localDate);

        System.out.println(strLocalDate);
    }
}
