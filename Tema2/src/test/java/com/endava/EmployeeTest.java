package com.endava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class EmployeeTest {

    @Test
    public void test() {
        Employee employee1 = new Employee("Robert", 1994, 34600, "64C - WallStreet");
        Employee employee2 = new Employee("Sam", 2000, 45700, "68D - WallStreet");
        Employee employee3 = new Employee("John", 1999, 53700, "26B - WallStreet");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Formatter table = new Formatter();
        table.format(" %6s %24s %15s %21s\n", "\033[0;1m  Name", "Year of Joining", "Salary", "Address\033[0;0m");

        employees.forEach(employee -> {
            table.format(" %7s %16s %21s %21s\n", employee.getName(), employee.getYearOfJoining(), employee.getSalary(), employee.getAddress());
        });

        System.out.println(table);
    }
}
