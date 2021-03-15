package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class question28 {
    public static void main(String[] args) {

    /*Write a program in a single class having the following functions.
            a. isPrimenumber(int)
            b. firstNthPrime(int )
            c. allPrimebetween(int start , int end)*/

        System.out.println(findPrimes(1, 100));

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




