package ss11_file;

import ss11_file.util.ReadFileUtil;
import ss11_file.util.WriteFileUtil;

import java.io.IOException;
import java.util.List;

public class StudentManagement {

    private static final String PATH_STUDENT_FILE = "src/ss11_file/data/student.csv";

    public static void main(String[] args) throws IOException {
        showList();
        create();
        showList();
    }

    public static void showList() throws IOException {
        List<Student> students = ReadFileUtil.readStudentFile(PATH_STUDENT_FILE);

        // Xuất danh sách student
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("\n\n=========== Thông tin sinh viên thứ %d ===========\n", i + 1);
            students.get(i).output();
        }
    }

    public static void create() throws IOException {
        List<Student> students = ReadFileUtil.readStudentFile(PATH_STUDENT_FILE);

        Student student = new Student();
        student.input();
        students.add(student);

        WriteFileUtil.writeStudentFile(PATH_STUDENT_FILE, students);
    }
}
