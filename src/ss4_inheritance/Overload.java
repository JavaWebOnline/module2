package ss4_inheritance;

public class Overload {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3, 4));
//        final int MAX_STUDENT = 50;
    }

}
