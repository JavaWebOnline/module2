package ss1_oop_overview;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String color;

    public void eat() {
        System.out.println(name + " ăn nhanh");
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        name = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào màu sắc: ");
        color = scanner.nextLine();
    }

    public void output() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("color: " + color);
    }
}
