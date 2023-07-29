package ss4_inheritance;

import java.util.Scanner;

public abstract class Employee {
    private String id;
    private String fullName;
    private String dayOfBirth;
    private String address;

    public abstract double calculateSalary();

    public Employee() {
    }

    public Employee(String id, String fullName, String dayOfBirth, String address) {
        this.id = id;
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên: ");
        this.fullName = scanner.nextLine();

        System.out.print("Nhập vào ngày sinh: ");
        this.dayOfBirth = scanner.nextLine();

        System.out.print("Nhập vào địa chỉ: ");
        this.address = scanner.nextLine();
    }

    public void output() {
        System.out.println("Mã: " + this.id);
        System.out.println("Tên: " + this.fullName);
        System.out.println("Ngày sinh: " + this.dayOfBirth);
        System.out.println("Địa chỉ: " + this.address);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
