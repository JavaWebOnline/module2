package ss11_file.util;

import ss11_file.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    public static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(data);

        bufferedWriter.close();
        fileWriter.close();
    }

    public static void writeStudentFile(String path, List<Student> students) throws IOException {
        StringBuilder stringBuilder = new StringBuilder("id,name,score");
        for(Student student : students) {
            stringBuilder.append("\n").append(student.toString());
        }

        writeFile(path, stringBuilder.toString());
    }
}
