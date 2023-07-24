package ss3_static.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeUtil {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static String format(LocalDate localDate) {
        return localDate.format(formatter);
    }
}
