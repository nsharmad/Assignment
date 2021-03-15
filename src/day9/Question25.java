package day9;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {


        // Write a program that prompts the user to enter the number of students and each student’s name and score.
        // Finally display the student with the highest score.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int numOfStudents = input.nextInt();
        System.out.println("Enter the name of student: ");
        String studentName = input.next();
        System.out.println("Enter the student score: ");
        double maxScore = input.nextDouble();

        for (int i = 1; i < numOfStudents; i++) {
            System.out.println("Enter the name of student: ");
            String name = input.next();
            System.out.println("Enter the student score: ");
            double score2 = input.nextDouble();
            if (score2 > maxScore) {
                studentName = name;
                maxScore = score2;
            }
        }
        System.out.println((new StringBuilder("Top student "+studentName)).append("'s score is ").append(maxScore).toString());


    }


}
