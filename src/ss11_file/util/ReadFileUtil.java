package ss11_file.util;

import ss11_file.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<String> readFile(String path) throws IOException {
        List<String> lines = new ArrayList<>();

        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine();// Loại bỏ header

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }

        bufferedReader.close();
        fileReader.close();

        return lines;
    }

    public static List<Student> readStudentFile(String path) throws IOException {
        List<Student> students = new ArrayList<>();
        List<String> lines = readFile(path);

        Student student;
        for(String line : lines) {
            String[] info = line.split(",");
            student = new Student();
            student.setId(info[0]);
            student.setName(info[1]);
            student.setScore(Double.parseDouble(info[2]));

            students.add(student);
        }

        return students;
    }
}
