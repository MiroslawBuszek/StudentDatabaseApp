package com.mbuszek;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    // generate an id
    private void setStudentID() {
        // grade level + id
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // enroll in course
    public void enroll() {
        do {
            System.out.println("enter course to enroll (Q to quite): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance += costOfCourse;
            } else {
                System.out.println("BREAK!");
                break;
            }
        } while (1 != 0) ;

        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }
}
    // view balance

    // pay tuition

    // show status

