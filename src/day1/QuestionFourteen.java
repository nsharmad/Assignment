package day1;

import java.util.Scanner;

public class QuestionFourteen {


    public static void main(String[] args) {

        //Write a program to relate two integers entered by the user using = =or > or < sign.

        Scanner a = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = a.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = a.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers match");
        }

        if (firstNumber > secondNumber) {
            System.out.println("First Number is greater than the second number");
        }

        if (firstNumber < secondNumber) {
            System.out.println("First Number is smaller than second number");
        }

    }


}
