package day1;

import java.util.Scanner;

public class QuestionTen {

    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);

        System.out.println("========First Question========");

        System.out.println("Enter the value of u : ");
        double u = m.nextDouble();

        System.out.println("Enter the value of t : ");
        double t = m.nextDouble();

        System.out.println("Enter the value of a : ");
        double ai = m.nextDouble();

        double si = u * t + 0.5 * ai * t * t;
        System.out.println("The value of s is " + si);


        System.out.println("========Second Question========");

        System.out.println("Enter the value of a : ");
        double a1 = m.nextDouble();

        System.out.println("Enter the value of b : ");
        double b1 = m.nextDouble();

        System.out.println("Enter the value of c : ");
        double c1 = m.nextDouble();

        double s = (a1 + b1 + c1) / 2;

        double area = s * (s - a1) * (s - b1) * (s - c1);

        System.out.println("The value of area is " + Math.sqrt(area));

        System.out.println("========Third Question========");

        System.out.println("Enter the value of a : ");
        double a = m.nextDouble();

        System.out.println("Enter the value of b : ");
        double b = m.nextDouble();

        System.out.println("Enter the value of c : ");
        double c = m.nextDouble();

        double x1 = b * b - 4 * a * c;
        System.out.println("The value of x1 is " + Math.sqrt(x1));

        double x2 = (-b + Math.sqrt(x1))/ (2 * a);
        System.out.println("The value of x2 is " + x2);


    }


}
