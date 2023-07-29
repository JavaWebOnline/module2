package ss4_inheritance;

import java.util.Scanner;

public class ManagementEmployee extends Employee {
    private double basicSalary;
    private double coefficientsSalary;

//    @Override
    public double calculateSalary() {
        return basicSalary * coefficientsSalary;
    }

    public ManagementEmployee() {
    }

    public ManagementEmployee(String id, String fullName, String dayOfBirth, String address, double basicSalary, double coefficientsSalary) {
        super(id, fullName, dayOfBirth, address);
        this.basicSalary = basicSalary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();

        System.out.print("Nhập vào lương cơ bản: ");
        this.basicSalary = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập vào hệ số lương: ");
        this.coefficientsSalary = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Lương cơ bản: " + this.basicSalary);
        System.out.println("Hệ số lương: " + this.coefficientsSalary);
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }
}
