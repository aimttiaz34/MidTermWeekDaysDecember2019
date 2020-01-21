package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
    double n1;
    double n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number");
             n1 = sc.nextDouble();
        System.out.println("Input the second number");
             n2 = sc.nextDouble();
        System.out.println("The summation of two number is :"+(n1+n2));
        System.out.println("The subtraction of two number is :"+(n1-n2));
        System.out.println("The multiplication of two number is :"+(n1*n2));
        System.out.println("The division of two number is :"+(n1/n2));

    }
}
