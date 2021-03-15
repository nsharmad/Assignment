package day1;

import java.sql.SQLOutput;

public class QuestionEleven {
    public static void main(String[] args) {

        System.out.println("========With Temp Variable========");

        int a=5;
        int b=6;

        int temp = a;

        System.out.println(temp);

        a=b;
        b= temp;

        System.out.println(a);

        System.out.println(b);


        System.out.println("========Without Temp Variable========");

        int s=20;
        int t=30;

        s= s+t;
        System.out.println("Value of s is " +s);
        t=s-t;
        System.out.println("Value of t is " +t);
        s=s-t;
        System.out.println("Value of s is " +s);




    }





}
