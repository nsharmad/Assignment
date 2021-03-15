package day8;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class QuestionTwenty {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter operator of choice '+.Add', '-.Subtract' '*.Multiply', '/.Divide'");
        char operator = input.next().charAt(0);

        int firstNumber = 0, secondNumber = 0;

        if (operator == '+' || operator == '-' || operator == '/' || operator == '*') {
            System.out.println("Enter First Number");
            firstNumber = input.nextInt();
            System.out.println("Enter Second Number");
            secondNumber = input.nextInt();
        }


        switch (operator) {
            case '+':
                int sum = firstNumber + secondNumber;
                System.out.println("Sum of a and b is: " + sum);
                break;
            case '-':
                int sub = firstNumber - secondNumber;
                System.out.println("Subtraction of a and b is: " + sub);
                break;
            case '*':
                int mul = firstNumber * secondNumber;
                System.out.println("Multiplication of a and b is: " + mul);
                break;
            case '/':
                int div = firstNumber / secondNumber;
                System.out.println("Division of a and b is: " + div);
                break;
            default:
                System.out.println("Invalid selection!!!");
                break;
        }
    }

}