package com.example.task1;

public class course {
    int courseId;
    String courseName;
    int duration; // in months

    // Constructor
    public course(int courseId, String courseName, int duration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to show course details
    public void showCourse() {
        System.out.println("Course ID    : " + courseId);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Duration     : " + duration + " months");
    }
}
