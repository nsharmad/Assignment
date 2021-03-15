package day1;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = input.nextInt();
        System.out.println("Enter value of b: ");
        int b = input.nextInt();
        /*System.out.println("Enter value of c: ");
        int c = input.nextInt();

        int  ave = (a + b+ c) /3;*/
        int sum = a+b;
        int  ave = sum/2;

        //System.out.println("Ave of a, b, and c is: " + ave);
        System.out.println("Sum of a and b is: "+sum);
        System.out.println("Average of a and b is " + ave);









    }
}
