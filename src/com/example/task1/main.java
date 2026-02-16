package com.example.task1;

public class main {
    public static void main(String[] args) {

        course c1 = new course(101, "Java", 3);
        course c2 = new course(102, "Python", 2);

        Student s1 = new Student(1, "Harshitha", c1);
        Student s2 = new Student(2, "Vaish", c2);

        s1.show();
        s2.show();
    }
}
