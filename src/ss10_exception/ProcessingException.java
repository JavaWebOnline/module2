package ss10_exception;

public class ProcessingException {
    public static void main(String[] args) {
        try {
//            String str = null;
//            str.length();
//            int a = 1 / 0;
            return;
        }  catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Lỗi chia cho 0");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Lỗi biến đối tượng đang tham chiếu đến null");
        } catch (Exception e) {
            System.out.println("Lỗi hệ thống, ...");
        } finally {
            System.out.println("Khối finally");
        }

        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
