package day1;

import java.util.Scanner;

public class QuestionFive {

    public static void main(String[] args) {

        System.out.println("========Area of Circle========");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double r= input.nextDouble();

        double area= Math.PI*r*r;
        System.out.println("The Area of the Circle is: "+area);


        System.out.println("========Area of Rectangle========");

        System.out.println("Enter the length of the rectangle: ");
        double l= input.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double w= input.nextDouble();

        double areaOfRectangle = l*w;

        System.out.println("The area of the rectangle is: " +areaOfRectangle);



        System.out.println("========Area of Triangle========");

        System.out.println("Enter the base of the triangle: ");
        double base= input.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height= input.nextDouble();

        double areaOfTriangle = (base*height)/2;
        System.out.println("The area of the triangle is: " +areaOfTriangle);






    }


}
