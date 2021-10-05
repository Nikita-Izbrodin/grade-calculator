package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        System.out.println("Enter maximum mark:");
        double maxMark = input.nextDouble();
        boolean loop = true;
        while (loop == true) {
            System.out.println("Enter marks achieved:");
            double markAch = input.nextDouble();
            double grade = (markAch/maxMark)*100;
            if (grade > 80) {
                System.out.println("Grade achieved: A");
            } else if (grade > 70 && grade <= 80) {
                System.out.println("Grade achieved: B");
            } else if (grade > 60 && grade <= 70) {
                System.out.println("Grade achieved: C");
            } else if (grade > 50 && grade <= 60) {
                System.out.println("Grade achieved: D");
            } else if (grade > 40 && grade <= 50) {
                System.out.println("Grade achieved: E");
            } else if (grade <= 40) {
                System.out.println("Grade achieved: U");
            } else if (grade < 0) {
                System.out.println("Error, marks achieved are less than 0");
            } else if (grade > 100) {
                System.out.println("Error, more marks than total marks");
            }
        }
    }
}
