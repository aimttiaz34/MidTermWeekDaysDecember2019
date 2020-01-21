package problemandsolutions;

import java.util.Scanner;

public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.

    public static void main(String[] args) {
        int num,i,j,temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort:");
        num=input.nextInt();

        int arr[]= new int[num];
        System.out.println("Enter "+ num + " integers: ");

        for (i=0;i<num; i++){
            arr[i]= input.nextInt();
        }
            for (i=0; i<(num-1); i++);{
                for (j=0; j<num-i-1; j++){
                    if (arr[j]> arr[j+1])
                    {
                        temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1]= temp;

                    }
                }


        }
        System.out.println("Sorted list of integers");
        for (i=0; i< num;i++)
            System.out.println(arr[i]);

    }
}
