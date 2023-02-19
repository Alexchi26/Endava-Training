package com.endava;

import org.junit.Test;

public class StudentTest {

    @Test
    public void test() {
        Student student1 = new Student("John", 2);
        System.out.println("The name of the student is " + student1.getName() + " and the roll number is " + student1.getRollNumber() + ".");

        Student student2 = new Student("Sam", 3, "0750000000", "Iasi");
        Student student3 = new Student("John", 4, "0750000001", "Bucuresti");
        System.out.println("The name of the student is " + student2.getName() + "\n     Roll number: " + student2.getRollNumber() +
                "\n     Phone number: " + student2.getPhoneNumber() + "\n     Address: " + student2.getAddress());
        System.out.println("The name of the student is " + student3.getName() + "\n     Roll number: " + student3.getRollNumber() +
                "\n     Phone number: " + student3.getPhoneNumber() + "\n     Address: " + student3.getAddress());
    }
}
