package ss10_exception;

import ss10_exception.exception.Under18YearsOldException;

import java.util.Scanner;

public class CustomException {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Kiểm tra tuổi hợp lệ (trên 18 tuổi)
        int age;
        while (true) {
            try {
                age = inputAgeOver18();
                break;
            } catch (Under18YearsOldException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Tuổi: " + age);
    }

    public static int inputAgeOver18() throws Under18YearsOldException {
        System.out.print("Nhập vào tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 18) {
            throw new Under18YearsOldException("Bạn chưa đủ tuổi: ");
        }

        return age;
    }
}
