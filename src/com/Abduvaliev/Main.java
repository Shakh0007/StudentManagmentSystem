package com.Abduvaliev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ask how many new students we want to add
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many students will be enrolled: ");
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }
}
