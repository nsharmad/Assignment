package day10;

import java.util.Scanner;

//Write a Program to accept 5 values in an array and display their sum.


public class question32 {
    public static void main(String[] args) {
        double sum=0;
        Scanner input= new Scanner(System.in);
        //int a[]= new int[i];
        System.out.println("Enter first number: ");
        int firstNum= input.nextInt();
        System.out.println("Enter second number: ");
        int secondNum= input.nextInt();
        System.out.println("Enter third number: ");
        int thirdNum= input.nextInt();
        System.out.println("Enter fourth number: ");
        int fourthNum= input.nextInt();
        System.out.println("Enter fifth number: ");
        int fifthNum= input.nextInt();

        double values[] = {firstNum, secondNum, thirdNum, fourthNum, fifthNum};

        for (int i=0; i< values.length;i++){

            sum=sum + values[i];
        }
        System.out.println("Sum of entered numbers is: " +sum);
    }



}
