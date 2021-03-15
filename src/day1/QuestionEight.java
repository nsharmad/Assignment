package day1;

import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {

        System.out.println("========Celsius to Fahrenheit========");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        double c= sc.nextDouble();

        double Fahrenheit= c*9/5 + 32;
        System.out.println("The temperature in Fahrenheit is: "+Fahrenheit);


        System.out.println("========Fahrenheit to Celsius========");

        System.out.println("Enter the temperature in Fahrenheit: ");
        double f= sc.nextDouble();

        double Celsius= (f-32) * 5/9;
        System.out.println("The temperature in Fahrenheit is: "+Celsius);




    }



}
