package day11;

import java.util.Arrays;

public class question34and35 {
    public static void main(String[] args) {
        Integer[] intArray = {10,20,20,30,40,50,60,60,70,80,90};

        //print array starting from first element
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");

        System.out.println();
        int n=intArray.length;
        Arrays.sort(intArray);
        System.out.println("Second highest number " + intArray[n-2]);






    }
}

