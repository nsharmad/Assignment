package day8;

import java.util.Scanner;

public class QuestionTwentyone {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-7");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("It is Sunday");
                break;
            case 2:
                System.out.println("It is Monday");
                break;
            case 3:
                System.out.println("It is Tuesday");
                break;
            case 4:
                System.out.println("It is Wednesday");
                break;
            case 5:
                System.out.println("It is Thursday");
                break;
            case 6:
                System.out.println("It is Friday");
                 break;
            case 7:
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("Invalid input!!");
                break;
        }
    }}