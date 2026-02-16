package com.example.task1;

public class Student {
    int id;
    String name;
    course c1;   // HAS-A relationship (Student has a Course)

    // Constructor
    public Student(int id, String name, course c1) {
        this.id = id;
        this.name = name;
        this.c1 = c1;
    }

    public void show() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        c1.showCourse();   // calling Course method
        System.out.println("----------------------");
    }
}
