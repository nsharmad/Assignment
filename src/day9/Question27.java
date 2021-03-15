package day9;

import java.util.Scanner;

public class Question27 {

    //Write a Program to sum each digit of given number as well as product. //456 =>4*5*6 and 4+5+6

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num = input.nextInt();

        int sum = 0;
        int prod = 1;
        while (num != 0) {
            int temp = num % 10;
            sum = sum + temp;
            prod = prod * temp;
            num = num/10;
        }

        System.out.println("sum of " + num + "is: " + sum);
        System.out.println("prod of " + num + "is: " + prod);

    }


}
