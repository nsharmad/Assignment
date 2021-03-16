package day10;

import java.util.Scanner;

public class question29 {
    public static double sumOfSeries(double num)
    {
        double res = 0, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

            res = res + (i / fact);
        }
        return (res);
    }

    public static void main(String[] args)
    {
        double n = 5;
        System.out.println("Sum: " + sumOfSeries(n));
    }
}





