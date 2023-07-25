package ss3_static;

public class Student {
    private int id; // biến toàn cụ
    private String name; // biến toàn cụ

    static String schoolName = "Bách Khoa";

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
