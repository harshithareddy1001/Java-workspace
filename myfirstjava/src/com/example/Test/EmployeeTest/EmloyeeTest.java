package com.example.Test.EmployeeTest;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EmloyeeTest {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ID");
        int id=sc.nextInt();
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.print("Enter Designation (programmer/designer): ");
        String designation = sc.next();
        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter leaves Taken");
        int leavesTaken= sc.nextInt();
        Employee emp = new Employee(id, name,salary,designation, leavesTaken);
        emp.display();

        sc.close();
    }
}



