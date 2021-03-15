package day1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestionTwelve {
    public static void main(String[] args) {

        Scanner i= new Scanner(System.in);

        System.out.println("Enter first and Last Name name: ");
        String firstName = i.nextLine();

        //System.out.println("Enter last name: ");
        //String lastName = i.next();

        System.out.println("Enter nationality: ");
        String nationality = i.next();


        System.out.println("Enter the roll number: ");
        int rollNumber = i.nextInt();


        System.out.println("========Student Information========");
        //System.out.println("Name: " +firstName + " " +lastName + "\n" + "RollNumber: "+rollNumber + "\n" + "Nationality: " +nationality);
        System.out.println("Name: " +firstName + "\n" + "RollNumber: "+rollNumber + "\n" + "Nationality: " +nationality);

    }


}
