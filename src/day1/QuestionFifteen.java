package day1;


import java.util.Scanner;

public class QuestionFifteen {

    public static void main(String[] args) {

        //Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].
        Scanner r = new Scanner(System.in);
        System.out.println("Enter number between 0-128: ");
        int n = r.nextInt();
        if (n >= 0 && n <= 128) {
            char ch = (char) n;
            System.out.println("ASCII code of " + n + " is " + ch);
        }

    }


}
