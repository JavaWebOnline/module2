package ss3_static;

public class MyClass {
    static int a = 2;
    int b = 2;

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass();

        m1.a++;
        m1.b++;

        m2.a++;
        m2.b++;

        System.out.println(m1.a); // kết quả?
        System.out.println(m1.b); // kết quả?
    }
}

