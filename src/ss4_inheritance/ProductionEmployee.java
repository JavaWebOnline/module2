package ss4_inheritance;

import java.util.Scanner;

public class ProductionEmployee extends Employee {
    private double numberProducts;

    public ProductionEmployee() {
    }

    public ProductionEmployee(String id, String fullName, String dayOfBirth, String address, double numberProducts) {
        super(id, fullName, dayOfBirth, address);
        this.numberProducts = numberProducts;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();

        System.out.print("Số sản phẩm: ");
        this.numberProducts = Double.parseDouble(scanner.nextLine());
    }

    public void output() {
        super.output();
        System.out.println("Số sản phẩm: " + this.numberProducts);
    }

    public double getNumberProducts() {
        return numberProducts;
    }

    public void setNumberProducts(double numberProducts) {
        this.numberProducts = numberProducts;
    }
}
