package ss10_exception;

public class ExceptionStudy {
    public static void main(String[] args) {
        // ArithmeticException
//        int a = 1 / 0;
        //double b = 1.0 / 0;
        //System.out.println(b);

        // NullPointerException
//        String str = null;
//        str.length();

        //NumberFormatException
//        int a = Integer.parseInt("abc");

        // ArrayIndexOutOfBoundsException
        int[] arr = {10, 20, 30};
        System.out.println(arr[3]);

        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
