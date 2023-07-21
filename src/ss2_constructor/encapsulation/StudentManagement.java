package ss2_constructor.encapsulation;

public class StudentManagement {
    public static void main(String[] args) {
        Student student = new Student();

//        student.setId(100);
        student.setScore(100);

        System.out.println("ĐIểm: " + student.getScore());

//        student.setName("Nguyễn Văn A");
//
//        System.out.println("Tên: " + student.getName());

//        student.name = "Nguyễn Văn A";
//        System.out.println("Tên: " + student.name);

    }
}
