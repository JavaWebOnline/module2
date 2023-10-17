package ss11_file;

import ss11_file.util.ReadFileUtil;

import java.io.IOException;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) throws IOException {
        showList();
    }

    public static void showList() throws IOException {
        List<Student> students = ReadFileUtil.readStudentFile("src/ss11_file/data/student.csv");

        // Xuất danh sách student
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("\n\n=========== Thông tin sinh viên thứ %d ===========\n", i + 1);
            students.get(i).output();
        }
    }
}
