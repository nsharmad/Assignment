package day1;

import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {

        System.out.println("========Pounds to KG========");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the weight in Pounds: ");
        int p= in.nextInt();

        double weightInKG= p/2.205;

        //after rounding
        weightInKG = Math.round(weightInKG * 100.0) /100.0;
        System.out.println (p+ " pound is equal to " +weightInKG+ " kgs");

    }



}
