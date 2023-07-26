package ss5_polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTime {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10); // Compiler chọn phương thức add(int, int)
        double sum2 = calculator.add(3.14, 2.71); // Compiler chọn phương thức add(double, double)
        int sum3 = calculator.add(1, 2, 3); // Compiler chọn phương thức add(int, int, int)
    }
}
