package day9;

import java.util.Scanner;

public class Question23 {

    //Write a Program to sum 1 to nth natural numbers.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = input.nextInt();
        int total = 0;

        for (int i = 1; i <= number; i++) {

            total = total + i;
        }

        System.out.println("Sum of first " + number + " " + "natural numbers is: " + total);


    }


}
