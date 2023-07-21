package ss2_constructor.student_management;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String color;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String color) {
//        this.name = name;
//        this.age = age;
        this(name, age);
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " ăn nhanh");
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        this.name = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào màu sắc: ");
        this.color = scanner.nextLine();
    }

    public void output() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("color: " + color);
    }
}
