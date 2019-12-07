/* Chapter 2 of Java How to Program: Fourth Edition
   Debugging Problem */
package hw1.task1;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int num1, num2, num3;
        int sum;
        int product;
        int average;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter first integer: ");
        num1 = input.nextInt();

        System.out.printf("Enter second integer: ");
        num2  = input.nextInt();

        System.out.printf("Enter third integer: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;
        average = ( num1 + num2 + num3 ) / 3;

        System.out.print("The sum is " + sum + "\nThe product is " + product +  "\nThe average is" + average);
    }

} // end class hw1.task1.Arithmetic

