package day9;

import java.util.Scanner;

public class Question24 {

    public static void main(String[] args) {

        //Write a program to print the factorial number of given numbers

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();

        int sum=0;
        int f=1;
        for (int i=1; i<=n; i++)
        {
            f=f*i;
        }
        System.out.println("factorials of "+n+" is: " +f);



    }




}
