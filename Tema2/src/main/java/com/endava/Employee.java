package com.endava;

public class Employee {
    private String name;
    private int yearOfJoining;
    private int salary;
    private String address;

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public Employee(String employeeName, int employeeYearOfJoining, int employeeSalary, String employeeAddress) {
        this.name = employeeName;
        this.yearOfJoining = employeeYearOfJoining;
        this.salary = employeeSalary;
        this.address = employeeAddress;
    }


}
