package ss11_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss11_file/data/output.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Nguyễn Văn A\n");
        bufferedWriter.write("Nguyễn Văn B\n");
        bufferedWriter.write("Nguyễn Văn C");
        bufferedWriter.newLine();
        bufferedWriter.write("Nguyễn Văn B");
        bufferedWriter.newLine();


        bufferedWriter.close();
        fileWriter.close();

    }
}
