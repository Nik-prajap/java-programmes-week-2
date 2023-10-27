package JavaProgrammesWeek2;

import java.util.Scanner;

/**
 * Write a Java Program that takes three numbers as input to calculate and
 * Print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double x = scanner.nextDouble();
        System.out.println("Enter the Second number : ");
        double y = scanner.nextDouble();
        System.out.println("Enter the Third number : ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x, y, z);
        // Closing the scanner object
        scanner.close();
    }

    //Calculation the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.println(" The average of " + a + " , " + b + " and " + c + " is : " + average);
    }
}