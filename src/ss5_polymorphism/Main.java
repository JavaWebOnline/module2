package ss5_polymorphism;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyễn Văn A", 9.6);
        Student s2 = new Student(2, "Nguyễn Văn B", 10);

        System.out.println(s1.equals(s2));

        System.out.println(s1.toString());

        String str = "Thông tin: " + s1;
        System.out.println(str);

        Object o = new Student();
    }
}
