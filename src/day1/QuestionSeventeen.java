package day1;

import java.util.Scanner;

public class QuestionSeventeen {
    public static void main(String[] args) {

        //Write a program to calculate leap year.
        Scanner r = new Scanner(System.in);
        System.out.println("Enter any year ");

        int year = r.nextInt();

        //check whether year is a leap year
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");

        } else if (year % 400 == 0) {
            System.out.println(year + " is a leap year");

        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}
