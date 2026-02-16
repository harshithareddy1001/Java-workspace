package com.example;

public class Employee {
    int id;
    String name;
    double Salary;
    String designation;
    int leavestaken;
    Employee(int id,String name,double Salary,String designation,int leavestaken){
        this.id=id;
        this.name = name;
        this.Salary = Salary;
        this.designation = designation;
        this.leavestaken = leavestaken;
    }
    double calcSalary() {
        double newSalary = Salary;
        if (designation.equalsIgnoreCase("Programmer")) {
            newSalary = Salary + (Salary * 0.10);
        } else if (designation.equalsIgnoreCase("Designer")) {
            newSalary = Salary + (Salary * 0.20);
        }
        int TotalLeaves = 32;
        if (leavestaken > TotalLeaves) {
            int extraleaves = leavestaken-TotalLeaves;
            double deduction = extraleaves * 500;
            newSalary = newSalary - deduction;
        }
        return newSalary;
    }
    void display(){
        System.out.println("\nEmployee Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Final Salary: " + calcSalary());
    }


}

