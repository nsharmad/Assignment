package day1;

public class QuestionEighteen {
    public static void main(String[] args) {


        //Write a program to display the largest number from given three values.

        int a = 5;
        int b = 14;
        int c = 6;

        if (a > b && a > c) {
            System.out.println(" a is largest one.");
        } else if (b > a && b > c) {
            System.out.println("b is largest one.");
        } else if (c > a && c > b) {
            System.out.println("c is largest one.");
        }

    }
}