package day9;

import java.util.Scanner;

// Write a program to print the table of given number


public class Question22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();

        for (int i=0; i<=10; i++){
            System.out.println(number+"*" +i+ "=" + (number*i));
        }
    }

}
