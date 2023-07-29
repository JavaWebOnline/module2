package ss6_abstraction;

import ss4_inheritance.Employee;
import ss4_inheritance.FullTimeEmployee;
import ss4_inheritance.TimeKeeping;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Employee employee = new FullTimeEmployee();
        employee.calculateSalary();
        System.out.println(TimeKeeping.MAX_WORKING_HOUR);
    }
}
