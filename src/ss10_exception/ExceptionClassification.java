package ss10_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionClassification {
    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Chương trình kết thúc không lỗi lầm");
    }

    static void readFile() throws FileNotFoundException {
        File file = new File("src/data/student.text");
        FileReader fileReader = new FileReader(file);
    }
}
