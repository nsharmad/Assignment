package day1;

import java.util.Scanner;

public class QuestionThirteen {
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);

        // Write a program to print the number entered by the user only if the number entered is negative.

        System.out.println("Enter the number: ");
        int number = p.nextInt();

        if (number < 0) {
            System.out.println("The number entered is " + number);

        }


    }


}
