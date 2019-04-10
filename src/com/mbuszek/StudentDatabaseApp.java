package com.mbuszek;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        // ask how many new users we want to add
        System.out.println("Enter number of new student to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // create n number of new students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}

