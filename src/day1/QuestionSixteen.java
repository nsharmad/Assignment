package day1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestionSixteen {

    public static void main(String[] args) {

        // Write a program to find the given number is even or odd.
        Scanner r = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = r.nextInt();

        if (x % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }

}
