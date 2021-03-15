package day8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestionNineteen {
    public static void main(String[] args) {
        //Write a Program to accept three sides of a triangle and display which kind of triangle is formed.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the measurement of side A of the triangle");
        double sideA = input.nextInt();

        System.out.println("Enter the measurement of side B of the triangle");
        double sideB = input.nextInt();

        System.out.println("Enter the measurement of side C of the triangle");
        double sideC = input.nextInt();

        if (sideA == sideB && sideB == sideC) {

            System.out.println("This is a Equilateral triangle"); //all sides equal
        } else if (sideA != sideB && sideB != sideC && sideA != sideC) {
            System.out.println("This is a Scalene triangle"); //no equal sides
        } else {
            System.out.println("This is a Isosceles triangle"); //two equal sides
        }

    }
}
