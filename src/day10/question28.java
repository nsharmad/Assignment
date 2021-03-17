package day10;

import java.util.Scanner;
import java.util.ArrayList;

/*Write a program in a single class having the following functions.
            a. isPrimenumber(int)
            b. firstNthPrime(int )
            c. allPrimebetween(int start , int end)*/


public class question28 {

    public static void isPrime(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer num= input.nextInt();

        boolean isPrime = true;
        for (int i=2;i<num;i++)
        {
            if (num%i==0)
            {
                isPrime=false;

            }

        }
            if (isPrime)
        {
            System.out.println(num+ " is a prime number");
        }

    }

        public static void firstNth(){

            int n;
            int status = 1;
            int num = 3;
            //For capturing the value of n
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the value of n:");
            //The entered value is stored in the var n
            n = scanner.nextInt();
            if (n >= 1)
            {
                System.out.println("First "+n+" prime numbers are:");
                //2 is a known prime number
                System.out.println(2);
            }

            for ( int i = 2 ; i <=n ;  )
            {
                for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
                {
                    if ( num%j == 0 )
                    {
                        status = 0;
                        break;
                    }
                }
                if ( status != 0 )
                {
                    System.out.println(num);
                    i++;
                }
                status = 1;
                num++;
            }
        }

    public static void main(String[] args) {
        System.out.println("Start of main block");

        isPrime();
        firstNth();

        Scanner input= new Scanner(System.in);
        System.out.println("Enter starting number: ");
        Integer startNum= input.nextInt();
        System.out.println("Enter ending number: ");
        Integer endNum= input.nextInt();


        System.out.println(findPrimes(startNum, endNum));

}

        public static ArrayList <Integer> findPrimes (int start, int end){
        ArrayList<Integer> primes = new ArrayList<>();
        for (int n=start;n<end;n++)
        {

            boolean prime = true;
            int i=2;
            while (i<=n/2){

                if (n%i==0){
                    prime=false;
                    break;
                }
                i++;
            }
                if (prime){
                    primes.add(n);
                }

        }


            return primes;


    }
    }

