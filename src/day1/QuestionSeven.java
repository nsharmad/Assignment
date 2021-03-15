package day1;

import java.util.Scanner;

public class QuestionSeven {

    public static void main(String[] args) {

        System.out.println("========Volume of Cylinder========");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder: ");
        double r= input.nextDouble();

        System.out.println("Enter the height of the cylinder: ");
        double h= input.nextDouble();

        double volumeOfCylinder= Math.PI*r*r*h;
        System.out.println("The Volume of the Cylinder is: "+volumeOfCylinder);



    }



}
