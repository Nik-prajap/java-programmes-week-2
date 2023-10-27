package JavaProgrammesWeek2;

import java.util.Scanner;

/**
 * Write a Java Program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data : Input a number: 8
 * Expected output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Programme_10_MultiplicationTable {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();
        multiplicationTableOf(number);
        // Closing the scanner object
        scanner.close();
    }

    //Printing the multiplication table of entered number
    public static void multiplicationTableOf(int number) {
        System.out.println(number + " x " + 1 + " = " + number);
        System.out.println(number + " x " + 2 + " = " + number * 2);
        System.out.println(number + " x " + 3 + " = " + number * 3);
        System.out.println(number + " x " + 3 + " = " + number * 4);
        System.out.println(number + " x " + 3 + " = " + number * 5);
        System.out.println(number + " x " + 3 + " = " + number * 6);
        System.out.println(number + " x " + 3 + " = " + number * 7);
        System.out.println(number + " x " + 3 + " = " + number * 8);
        System.out.println(number + " x " + 3 + " = " + number * 9);
        System.out.println(number + " x " + 10 + " = " + number * 10);
    }
}
