package ss11_file;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private double score;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào mã:");
        id = scanner.nextLine();

        System.out.print("Nhập vào tên:");
        name = scanner.nextLine();

        System.out.print("Nhập vào điểm:");
        score = Double.parseDouble(scanner.nextLine());
    }

    public void output() {
        System.out.println("Mã: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Điểm: " + score);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", id, name, score);
    }
}
