package day1;

import java.util.Scanner;

public class QuestionFour {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Principle is: ");
        double p = input.nextDouble();
        System.out.println("Time (in years) is: ");
        int t = input.nextInt();
        System.out.println("Annual Rate is: ");
        double r = input.nextDouble();



        double  i = (p * t * r) /100;

        System.out.println("Total Interest is $" + i);


    }
}
