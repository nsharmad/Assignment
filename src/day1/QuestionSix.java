package day1;

import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {

        System.out.println("========Perimeter of Circle========");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double r= input.nextDouble();

        double periMeterOfCircle= 2*Math.PI*r;
        System.out.println("The Area of the Circle is: "+periMeterOfCircle);


        System.out.println("========Perimeter of Rectangle========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double l= sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double w= sc.nextDouble();

        double sum = (l+w);
        double perimeterOfRectangle = (sum)*2;

        System.out.println("The perimeter of the rectangle is: " +perimeterOfRectangle);



        System.out.println("========Perimeter of Triangle========");

        Scanner tri = new Scanner(System.in);
        System.out.println("Enter value for the base of the triangle: ");
        double base= tri.nextDouble();
        System.out.println("Enter the value for side a of the triangle: ");
        double sideA= tri.nextDouble();
        System.out.println("Enter the value for side b of the triangle: ");
        double sideB= tri.nextDouble();
        double value = (base+sideA+sideB);
        double perimeterOfTriangle = (value);
        System.out.println("The perimeter of the triangle is: " +perimeterOfTriangle);








    }




}
