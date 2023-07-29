package ss4_inheritance;

import java.time.LocalTime;

public class FullTimeEmployee extends ProductionEmployee{
    public double calculateSalary() {
        return 1000000;
    }

    @Override
    public LocalTime checkIn() {
        return LocalTime.of(8, 0, 0);
    }
}
