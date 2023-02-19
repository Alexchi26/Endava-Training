package com.endava;

public class Student {
    private String name;
    private int rollNumber;
    private String phoneNumber;
    private String address;

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Student(String studentName, int studentRollNumber) {
        this.name = studentName;
        this.rollNumber = studentRollNumber;
    }

    public Student(String studentName, int studentRollNumber, String studentPhoneNumber, String studentAddress) {
        name = studentName;
        rollNumber = studentRollNumber;
        phoneNumber = studentPhoneNumber;
        address = studentAddress;
    }

}
